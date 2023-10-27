package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import racingcar.Car.Car;


public class RacingCarGame {

    Cars cars;


    public void generateCars(String carNames) {
        List<Car> carList = new ArrayList<>();

        for (String carName : carNames.split(",")) {
            carList.add(new Car(carName));
        }
        cars = new Cars(carList);
    }

}
