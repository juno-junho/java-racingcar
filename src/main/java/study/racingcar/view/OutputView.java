package study.racingcar.view;

import study.racingcar.domain.Car;
import study.racingcar.rule.OutputViewRule;

public class OutputView {
    private static final OutputViewRule rule;

    static {
        rule = new OutputViewRule();
    }

    public static void printCarNameSign() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void printTryCountSign() {
        System.out.println("시도할 회수는 몇 회 인가요?");
    }

    public static void printResultSign() {
        System.out.println("실행 결과");
    }

    public static void printBlankLine() {
        System.out.println();
    }

     public static void printCarNameAndStatus(Car car) {
         System.out.println(car.getCarName() + " : " + carStatus(car));
    }

    private static String carStatus(Car car) {
        final int position = car.getPosition();
        return rule.getCarShape().repeat(position);
    }

    public static void printGameResult(String winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }
}