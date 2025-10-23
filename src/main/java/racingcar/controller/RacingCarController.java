package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.InputParser;
import racingcar.domain.Running;
import racingcar.io.Input;
import racingcar.io.Output;

import java.util.List;

public class RacingCarController {



    public void run() {
        Input input = new Input();
        Output output = new Output();
        InputParser inputParser = new InputParser();
        Running running = new Running();
        Cars cars = new Cars();


        String inputNames = input.inputNames();
        List<String> names = inputParser.parse(inputNames);

        String inputCount  = input.inputCount();
        int count = inputParser.parseCount(inputCount);

        cars.makeCars(names);

        output.printGame(cars.getCars(), count);
        List<String> winners = running.parseWinner(cars.getCars());
        output.printWinners(winners);

    }
}
