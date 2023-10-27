package racingcar;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.api.Test;
import racingcar.RacingCarGame.TryCount;

public class TryCountTest {

    @Test
    void 시도횟수가_0이하일때_예외발생(){
        assertThatThrownBy(() -> new TryCount(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("시도 횟수는 1 이상이어야합니다");
    }
}
