package racingcar.io;

import racingcar.domain.Car;
import racingcar.domain.Running;

import java.util.List;

public class Output {


    public void printGame(List<Car> cars, int count) {
        System.out.println("실행 결과");

        while (count-- > 0) {
            printRace(cars, count);
        }
    }


    public void printWinners(List<String> winners) {
        System.out.print("최종 우승자 : ");

        if (winners.size() > 1) {
            System.out.print(winners.get(0));
            for (int i = 1; i < winners.size(); i++) {
                System.out.print(", " + winners.get(i));
            }
        } else {
            System.out.print(winners.get(0));
        }
    }


    private void printRace(List<Car> cars, int count) {
        Running running = new Running();
        running.moveCar(cars);

        for (Car car : cars) {
            String nowPosition = "-".repeat(car.getPosition());

            System.out.println(car.getName() + " : " + nowPosition);
        }

        System.out.println();
    }

}
