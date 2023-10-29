package racingcar.Car;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import racingcar.Constants;

public class Car {
    private final Name name;
    private final Position position;

    public Car(String carName) {
        this(carName, Constants.START_POSITION);
    }

    public Car(String carName, int position) {
        this.name = new Name(carName);
        this.position = new Position(position);
    }

    public void accelerate() {
        if (Randoms.pickNumberInRange(Constants.MINIMUM_RANGE, Constants.MAXIMUM_RANGE)
                >= Constants.THRESHOLD_VALUE) {
            position.addPosition();
        }
    }

    public String printCurrentPosition() {
        String currentPosition = IntStream.range(Constants.START_POSITION, position.getPosition())
                .mapToObj(i -> "-")
                .collect(Collectors.joining());
        return name.getName() + " : " + currentPosition;
    }

    public boolean isMaxPosition(int maxPosition) {
        return position.getPosition() >= maxPosition;
    }

    public int getPosition() {
        return this.position.getPosition();
    }

    public String getCarName() {
        return this.name.getName();
    }

}
