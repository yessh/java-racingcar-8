package racingcar.domain;

import camp.nextstep.edu.missionutils.test.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    @DisplayName("우승자가 2명 이상일 시 모두 출력한다")
    @Test
    void findWinners() {
        // given
        Cars cars = Cars.of(List.of("aaa", "bbb", "ccc"));

        // when
        Assertions.assertRandomNumberInRangeTest(
                () -> {
                    cars.moveAll();
                },
                5, 5, 3
        );
        List<Car> winners = cars.findWinner();

        // then
        assertThat(winners)
                .extracting(Car::getName)
                .containsExactlyInAnyOrder("aaa", "bbb");
    }
}