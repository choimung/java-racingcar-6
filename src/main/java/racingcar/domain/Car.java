package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import racingcar.utils.Constants;

public class Car {
    private final Name name;
    private final Position position;

    public Car(String carName) {
        this.name = new Name(carName);
        this.position = new Position();
    }

    public void move(int random) {
        if(random >= Constants.THRESHOLD_VALUE){
            position.addPosition();
        }
    }

    public String printNameAndCurrentPosition() {
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
