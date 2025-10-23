package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = 0;
    }


    public void move() {
        int diceNum = Randoms.pickNumberInRange(0, 9);

        if (diceNum >= 4) {
            this.position++;
        }
    }
}
