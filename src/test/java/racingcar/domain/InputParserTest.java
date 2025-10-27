package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.io.InputParser;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class InputParserTest {

    private final InputParser inputParser = new InputParser();

    @DisplayName("쉼표로 나눠진 문자열을 각 이름이 담긴 List로 반환한다")
    @Test
    void parse() {
        // given
        String input = "hi, my, name, is, yessh";
        // when
        List<String> names = inputParser.parse(input);
        // then
        assertThat(names).isEqualTo(List.of("hi", "my", "name", "is", "yessh"));
    }

    @DisplayName("쉼표 외에 특수문자 입력 될 시 예외발생")
    @Test
    void validateInvalidParse1() {
        // given
        String input = "h@@i";

        // when
        // then
        assertThatThrownBy(() -> inputParser.parse(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 알파벳과 숫자로만 이루어질 수 있습니다");
    }


    @DisplayName("이름 5자 넘길 시 예외발생")
    @Test
    void validateInvalidParse2() {
        // given
        String input = "abcdef";

        // when
        // then
        assertThatThrownBy(() -> inputParser.parse(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 5자 이하여야 합니다");
    }

}