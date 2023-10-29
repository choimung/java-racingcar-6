package racingcar;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.Car.Car;


public class CarList {

    private List<Car> cars;


    public CarList(List<Car> cars) {
        validateCarNameDuplication(cars);
        this.cars = cars;
    }

    public void validateCarNameDuplication(List<Car> cars) {
        HashSet<String> nonDuplicateNames = new HashSet<>();

        for (Car car : cars) {
            nonDuplicateNames.add(car.getCarName());
        }

        if (cars.size() != nonDuplicateNames.size()) {
            throw new IllegalArgumentException("자동차의 이름이 중복됩니다.");
        }
    }

    public void moveAllCar() {
        for (Car car : cars) {
            car.move();
        }
    }

    public void printCurrentPosition() {
        for (Car car : cars) {
            String carCurrentPosition = car.printCurrentPosition();
            System.out.println(carCurrentPosition);
        }
    }

    public void Winner() {
        int maxPosition = cars.stream().mapToInt(Car::getPosition).max().orElse(Integer.MIN_VALUE);

        List<String> winners = cars.stream().filter(car -> car.isWinner(maxPosition)).map(Car::getCarName)
                .collect(Collectors.toList());

        System.out.print(String.join(", ", winners));


    }


}
