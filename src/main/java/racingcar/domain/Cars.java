package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public static Cars of(List<String> carNames) {

        List<Car> carList = carNames.stream()
                .map(Car::new)
                .collect(Collectors.toList());

        return new Cars(carList);
    }

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void moveAll() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> findWinner() {

        int maxPosition = findMaxPosition();

        List<Car> winners = cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());

        return Collections.unmodifiableList(winners);
    }

    private int findMaxPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
    }


    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
