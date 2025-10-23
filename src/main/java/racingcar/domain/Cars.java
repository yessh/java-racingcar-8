package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars = new ArrayList<>();

    public void makeCars(List<String> carNames) {

        for (String carName : carNames) {
            Car car = new Car(carName, 0);
            cars.add(car);
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
