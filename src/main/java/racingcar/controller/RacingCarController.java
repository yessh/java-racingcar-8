package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.io.InputParser;
import racingcar.io.Input;
import racingcar.io.Output;

import java.util.List;

public class RacingCarController {


    public void run() {
        Input input = new Input();
        Output output = new Output();
        InputParser inputParser = new InputParser();

        // 입력 - 이름, 횟수
        String inputNames = input.inputNames();
        List<String> names = inputParser.parse(inputNames);

        String inputCount  = input.inputCount();
        int count = inputParser.parseCount(inputCount);

        Cars cars = Cars.of(names);

        // 출력 - 각 라운드, 최종 우승
        output.printGame();
        for(int i = 0; i<count; i++) {
            cars.moveAll();
            output.printRound(cars.getCars());
        }
        List<Car> winners = cars.findWinner();
        output.printWinners(winners);

    }
}
