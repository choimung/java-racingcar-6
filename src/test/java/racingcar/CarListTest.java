package racingcar;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import racingcar.RacingCarGame.RacingCarGame;

public class CarListTest {
    RacingCarGame game = new RacingCarGame();

    @Test
    void 경주할_자동차_이름을_입력받는다() {
        game.generateCars("pobi,woni,jun");
    }

    @Test
    void 자동차의_이름이_없을경우_예외발생() {
        assertThatThrownBy(() -> game.generateCars(" "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차의 이름이 입력되지않았습니다.");
    }

    @Test
    void 자동차의_이름이_5글자를넘을경우_예외발생() {
        assertThatThrownBy(() -> game.generateCars("123456"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차의 이름은 5글자를 넘을 수 없습니다.");
    }

    @Test
    void 자동차의_이름이_중복될경우_예외발생(){
        assertThatThrownBy(() -> game.generateCars("pobi,pobi"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차의 이름이 중복됩니다.");
    }
}
