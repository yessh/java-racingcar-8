package racingcar.domain;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InputParser {


    public List<String> parse(String input) {

        List<String> names = parseToNames(input);
        return names;
    }

    public int parseCount(String input) {

        validateNumber(input);

        return Integer.parseInt(input);
    }


    private List<String> parseToNames(String input) {

        String[] names = validateInputString(input);

        return Arrays.stream(names)
                .collect(Collectors.toList());
    }

    private String[] validateInputString(String input) {
        String regex = "^(.+)(\\s*,\\s*(.+))*$";
        String separatorRegex = "\\s*,\\s*";

        Matcher inputMatcher = Pattern.compile(regex).matcher(input);
        if (!inputMatcher.matches()) {
            throw new IllegalArgumentException("올바르지 않은 형식입니다");
        }

        String[] names = input.split(separatorRegex);
        for (String s : names) {
            if (s.length() > 5) {
                throw new IllegalArgumentException("이름은 5자 이하여야 합니다");
            }
        }

        return names;

    }


    private void validateNumber(String input) {
        String regex = "^(\\d*)";
        Matcher inputMatcher = Pattern.compile(regex).matcher(input);

        if (!inputMatcher.matches()) {
            throw new IllegalArgumentException("잘못된 입력입니다");
        }


    }


}
