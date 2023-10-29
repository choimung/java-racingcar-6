package racingcar;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import racingcar.Car.Car;


public class CarList {

    private final List<Car> cars;


    public CarList(List<Car> cars) {
        validateCarNameDuplication(cars);
        this.cars = cars;
    }

    public void validateCarNameDuplication(List<Car> cars) {
        Set<String> nonDuplicateNames = cars.stream()
                .map(Car::getCarName)
                .collect(Collectors.toSet());

        if (cars.size() != nonDuplicateNames.size()) {
            throw new IllegalArgumentException(Constants.ERROR_CAR_NAME_DUPLICATION);
        }
    }

    public void accelerateAllCars() {
        cars.forEach(Car::accelerate);
    }

    public List<String> AllCarCurrentPosition() {
        return cars.stream()
                .map(Car::CurrentPosition)
                .collect(Collectors.toList());
    }

    public String WinnerList() {
        int maxPosition = cars.stream().
                mapToInt(Car::getPosition)
                .max()
                .orElse(Integer.MIN_VALUE);

        List<String> winner = cars.stream()
                .filter(car -> car.isMaxPosition(maxPosition))
                .map(Car::getCarName)
                .collect(Collectors.toList());

        return String.join(", ", winner);
    }
}
