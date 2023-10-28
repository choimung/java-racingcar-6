package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import racingcar.Car.Car;

public class CarTest {

    @Test
    void 자동차_전진_테스트() {
        Car car = new Car("povi", 2);
        String input = car.printCurrentPosition();
        assertThat(input).isEqualTo("povi : --");
    }
}
