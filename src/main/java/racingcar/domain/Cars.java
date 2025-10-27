package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars = new ArrayList<>();

    public void makeCars(List<String> carNames) {

        for (String carName : carNames) {
            Car car = new Car(carName);
            cars.add(car);
        }
    }

    public void moveAll() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<String> parseWinner() {

        List<String> winners = new ArrayList<>();
        int maxPosition = 0;

        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
                winners.clear();
                winners.add(car.getName());
            } else if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }

        return winners;
    }


    public List<Car> getCars() {
        return cars;
    }
}
