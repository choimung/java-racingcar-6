package racingcar.RacingCarGame;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.ArrayList;
import java.util.List;
import racingcar.Car.Car;
import racingcar.CarList;


public class RacingCarGame {
    CarList carList;
    TryCount tryCount = new TryCount(5);

    public void play(){
        generateCars(getUserInputNames());
        TryCount userInputTryCount = getUserInputTryCount();
        System.out.println("실행결과");
        for(int i = 0; i < userInputTryCount.getTryCount(); i++){
            System.out.println();
            move();
            print();
        }
        System.out.println();
        System.out.print("최종 우승자 : ");
    }

    public void move(){
        carList.moveAllCar();
    }

    public void print(){
        carList.printCurrentPosition();
    }

    public void winner(){
        carList.Winner();
    }

    public String getUserInputNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return readLine();
    }

    public TryCount getUserInputTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return new TryCount(Integer.parseInt(readLine()));
    }

    public void generateCars(String carNames) {
        List<Car> cars = new ArrayList<>();

        for (String carName : carNames.split(",")) {
            cars.add(new Car(carName));
        }
        carList = new CarList(cars);
    }

}
