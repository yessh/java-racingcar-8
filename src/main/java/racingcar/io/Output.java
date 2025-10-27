package racingcar.io;

import racingcar.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class Output {


    public void printGame() {
        System.out.println("실행 결과");

    }

    public void printRound(List<Car> cars) {

        for (Car car : cars) {
            String nowPosition = "-".repeat(car.getPosition());

            System.out.println(car.getName() + " : " + nowPosition);
        }

        System.out.println();
    }


    public void printWinners(List<Car> winners) {
        System.out.print("최종 우승자 : ");

        String winnerNames = winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));

        System.out.println(winnerNames);
    }


}
