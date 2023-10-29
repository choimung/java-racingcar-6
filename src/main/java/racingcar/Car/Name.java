package racingcar.Car;

import racingcar.Constants;

public class Name {
    private final String name;

    public Name(String carName) {
        validateNull(carName);
        validateLength(carName);
        this.name = carName;
    }

    public String getName(){
        return name;
    }

    public void validateNull(String carName) {
        if (carName.isEmpty() || carName.isBlank()) {
            throw new IllegalArgumentException(Constants.ERROR_UNKNOWN_NAME);
        }
    }

    public void validateLength(String carName) {
        if (carName.length() > Constants.MAX_NAME_LENGTH){
            throw new IllegalArgumentException(Constants.ERROR_NAME_MAX_LENGTH);
        }
    }
}
