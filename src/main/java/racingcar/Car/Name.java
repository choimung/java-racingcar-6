package racingcar.Car;

public class Name {
    private static final int MIN_NAME_LENGTH = 1;
    private static final int MAX_NAME_LENGTH = 6;
    private String name;

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
            throw new IllegalArgumentException("자동차의 이름이 입력되지않았습니다.");
        }
    }

    public void validateLength(String carName) {
        if (carName.length() < MIN_NAME_LENGTH){
            throw new IllegalArgumentException("자동차의 이름은 1글자 이상이어야 합니다.");
        }

        if (carName.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException("자동차의 이름은 5이하만 가능합니다.");
        }
    }
}
