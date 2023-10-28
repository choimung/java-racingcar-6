package racingcar.Car;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static final int START_POSITION = 0;
    private static final int MINIMUM_RANGE = 0;
    private static final int MAXIMUM_RANGE = 9;
    private static final int THRESHOLD_VALUE = 4;
    private Name name;
    private Position position;

    public Car(String carName) {
        this(carName, START_POSITION);
    }

    public Car(String carName, int position) {
        this.name = new Name(carName);
        this.position = new Position(position);
    }

    public int move() {
        if (Randoms.pickNumberInRange(MINIMUM_RANGE, MAXIMUM_RANGE) >= THRESHOLD_VALUE) {
            position.addPosition();
        }
        return position.getPosition();
    }

    public String printCurrentPosition() {
        StringBuffer output = new StringBuffer();

        for(int i = 0; i < position.getPosition(); i++){
            output.append("-");
        }
        return name.getName() + " : " + output;
    }


    public int getPosition() {
        return this.position.getPosition();
    }

    public String getCarName() {
        return this.name.getName();
    }

}
