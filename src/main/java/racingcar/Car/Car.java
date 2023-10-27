package racingcar.Car;

public class Car {
    private Name name;


    public Car(String carName) {
        this.name = new Name(carName);
    }

    public String getCarName(){
        return this.name.getName();
    }

}
