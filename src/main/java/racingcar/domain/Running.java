package racingcar.domain;

public class Running {

    private final Cars cars = new Cars();

    public void play(int count) {

        while (count-- > 0) {

            for (Car car : cars.getCars()) {
                car.move();
            }
        }
    }
}
