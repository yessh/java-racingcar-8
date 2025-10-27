# java-racingcar-precourse

# 구현 목록

## 입력

### 입력 (`Input.class`)

- [x]  n 개의 자동차 이름을 (,) 기준 구분하여 입력.
- [x]  수행 횟수 입력

## 수행

### 입력 파서 ( `InputParser.class` )

- [x]  (,)로 분류된 각 문자열 담긴 List 반환
- [x]  수행 횟수 반환
- [x]  올바른 입력 검증
    - [x]  문자열 - 각 이름 글자수 검증
    - [x]  문자열 - 영어, 숫자, 쉼표 외의 것 입력
    - [x]  수행 횟수 - 수가 아닌 값, 음수

### Car (`Car.class` )

- [x]  0-9 랜덤값 이용하여 4이상 전진, 미만이면 정지

### Cars (`Cars.class`)

- [x]  이름 받아 `List<Car>` 생성
- [x]  모든 Car 객체를 1회 이동
- [x]  우승자들 `List<Car>`로 반환
- [x]  `List<Car>` 반환

### Controller ( `RacingCarController.class` )

- [x]  객체 조합하여 흐름 제어
- [x]  입력된 수행 횟수만큼 자동차 이동 및 결과 출력 반복


## 출력

### 출력(`Output.class`)

- [x]  턴마다 자동차 이름, 위치 출력
- [x]  최종 수행 시, 1등(또는 공동 1등) 출력