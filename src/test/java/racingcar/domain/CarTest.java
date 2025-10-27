package racingcar.domain;

import camp.nextstep.edu.missionutils.test.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CarTest {


    @DisplayName("랜덤 값이 4 이상일 시 이동한다.")
    @Test
    void moveCar() {

        assertRandomNumberInRangeTest(
                () -> {
                    Car car = new Car("yessh");
                    car.move();
                    assertThat(car.getPosition()).isEqualTo(1);
                },
                4
        );
    }

    @DisplayName("랜덤 값이 4 미만일 시 정지한다")
    @Test
    void dontMoveCar() {
        assertRandomNumberInRangeTest(
                () -> {
                    Car car = new Car("yessh");
                    car.move();
                    assertThat(car.getPosition()).isEqualTo(0);
                },
                3
        );
    }
}