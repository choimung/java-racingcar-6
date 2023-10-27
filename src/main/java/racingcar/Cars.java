package racingcar;

import java.util.HashSet;
import java.util.List;
import racingcar.Car.Car;

public class Cars {

    private List<Car> cars;

    public Cars(List<Car> cars){
        validateCarNameDuplication(cars);
        this.cars = cars;
    }

    public void validateCarNameDuplication(List<Car> cars){
        HashSet nonDuplicateNames = new HashSet();

        for(int i = 0; i < cars.size(); i++){
            nonDuplicateNames.add(cars.get(i).getCarName());
        }

        if(cars.size() != nonDuplicateNames.size()){
            throw new IllegalArgumentException("자동차의 이름이 중복됩니다.");
        }
    }




}
