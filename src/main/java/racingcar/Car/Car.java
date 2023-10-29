package racingcar.Car;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.Constants;

public class Car {
    private Name name;
    private Position position;

    public Car(String carName) {
        this(carName, Constants.START_POSITION);
    }

    public Car(String carName, int position) {
        this.name = new Name(carName);
        this.position = new Position(position);
    }

    public int move() {
        if (Randoms.pickNumberInRange(Constants.MINIMUM_RANGE, Constants.MAXIMUM_RANGE) >= Constants.THRESHOLD_VALUE) {
            position.addPosition();
        }
        return position.getPosition();
    }

    public String printCurrentPosition() {
        StringBuffer output = new StringBuffer();

        for (int i = 0; i < position.getPosition(); i++) {
            output.append("-");
        }
        return name.getName() + " : " + output;
    }

    public boolean isWinner(int maxPosition) {
        return position.getPosition() >= maxPosition;
    }


    public int getPosition() {
        return this.position.getPosition();
    }

    public String getCarName() {
        return this.name.getName();
    }

}
