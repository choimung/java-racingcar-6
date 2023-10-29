package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import racingcar.Car.Car;

public class CarTest {


    @Test
    void 자동차_생성_테스트() {
        Car car = new Car("povi");
        assertThat("povi").isEqualTo(car.getCarName());
    }

    @Test
    void 자동차_이름_유효성검사() {
        assertThatThrownBy(() -> new Car(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차의 이름이 입력되지않았습니다.");
    }

    @Test
    void 자동차_이름_길이검사() {
        assertThatThrownBy(() -> new Car("123456"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차의 이름은 5이하만 가능합니다.");
    }

    @Test
    void 자동차_전진_테스트(){
        Car car = new Car("povi",1);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 자동차_출력_테스트() {
        Car car = new Car("povi", 2);
        assertThat(car.printCurrentPosition()).isEqualTo("povi : --");
    }
}
