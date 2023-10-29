package racingcar.RacingCarGame;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TryCountTest {

    @Test
    void 시도횟수_유효성검사_1보다작은값을입력했을경우_예외() {
        assertThatThrownBy(() -> new TryCount(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("시도 횟수는 1 이상이어야합니다.");
    }

}