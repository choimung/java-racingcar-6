package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.Car.Car;
import racingcar.RacingCarGame.RacingCarGame;

public class CarListTest {
    RacingCarGame game = new RacingCarGame();

    @Test
    void 자동차의_이름이_중복될경우_예외발생(){
        assertThatThrownBy(() -> game.generateCars("pobi,pobi"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차의 이름이 중복됩니다.");
    }


    @Test
    void 모든_자동차_전진_테스트(){
        CarList carlist = new CarList(Arrays.asList(new Car("povi",2)
                ,new Car("woni",3)
                ,new Car("minu",5)));

        List<String> carsPosition = carlist.AllCarCurrentPosition();
        assertThat(carsPosition.get(0)).isEqualTo("povi : --");
        assertThat(carsPosition.get(1)).isEqualTo("woni : ---");
        assertThat(carsPosition.get(2)).isEqualTo("minu : -----");

    }

    @Test
    void 한명이_우승했을때_출력(){
        CarList carlist = new CarList(Arrays.asList(new Car("povi",2)
        ,new Car("woni",3)
        ,new Car("minu",5)));

        String winner = carlist.WinnerList();
        assertThat(winner).isEqualTo("minu");
    }

    @Test
    void 여러명이_우승했을때_출력() {
        CarList carlist = new CarList(Arrays.asList(new Car("povi", 5)
                , new Car("woni", 5)
                , new Car("minu", 5)));

        String winner = carlist.WinnerList();

        assertThat(winner).isEqualTo("povi, woni, minu");
    }
}
