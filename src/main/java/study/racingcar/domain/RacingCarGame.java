package study.racingcar.domain;

import study.racingcar.view.OutputView;

public class RacingCarGame {
    /**
     * 게임을 진행을 담당한다.
     */
    private final GameCars cars;
    private final Round round;

    public RacingCarGame(int numOfCar, int roundToPlay) {
        this.cars = new GameCars(numOfCar);
        this.round = new Round(roundToPlay);
    }

    public void run() {
        OutputView.printResultSign();
        for (int i = 0; i < round.getTotalRounds(); i++) {
            playTheGame(cars);
        }
    }

    private void playTheGame(GameCars cars) {
        for (Car car : cars) {
            execute(car);
        }
        OutputView.printBlankLine();
    }

    private void execute(Car car) {
        if (Car.isMovable(Rule.numberGenerator())) {
            car.move();
        }
        OutputView.printCarStatus(car);
    }
}