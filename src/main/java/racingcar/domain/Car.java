package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private String name;
    private int position;


    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    // 생성자
    public Car(String name, int position) {
        this.name = name;
        this.position = 0;
    }

    // 랜덤 따라 움직임
    public void move() {
        int diceNum = Randoms.pickNumberInRange(0, 9);

        if (diceNum >= 4) {
            this.position++;
        }
    }
}
