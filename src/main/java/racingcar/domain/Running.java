package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Running {


    public void moveCar(List<Car> cars, int count) {

        while (count-- > 0) {

            for (Car car : cars) {
                car.move();
            }
        }
    }

    public List<String> parseWinner(List<Car> cars) {

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
}
