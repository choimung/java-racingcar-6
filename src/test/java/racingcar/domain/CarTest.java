package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CarTest {

    @Test
    void 자동차_생성_테스트() {
        String name = "povi";
        Car car = new Car(name);
        Assertions.assertThat(car).isNotNull();
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "5글자를 초과 하는 이름", " "})
    void 자동차_이름_유효성검사(String name) {
        assertThatThrownBy(() -> new Car(name))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @CsvSource(value = {"3:0", "4:1"}, delimiter = ':')
    void 자동차_전진_테스트(int input, int expect) {
        Car car = new Car("povi");
        car.move(input);
        Assertions.assertThat(car.getPosition()).isEqualTo(expect);
    }


}