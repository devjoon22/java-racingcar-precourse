package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        CarsInRace carsInRace = new CarsInRace();
        carsInRace.enterCarsName();

        System.out.println("시도할 회수는 몇회인가요?");
        String progressNumberString = readLine();
        ProgressStep progressStep = new ProgressStep(progressNumberString);

        System.out.println("실행결과");
        for (int i = 0; i < progressStep.progressStopToInt(); i++) {
            carsInRace.allCarGoOrStop();
            System.out.println();
        }

        System.out.println("최종 우승자 : " + carsInRace.winnerString());
    }
}
