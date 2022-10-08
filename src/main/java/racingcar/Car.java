package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Car {
    private String carName;
    private int moveDistance;

    public Car(String carName) {
        this.carName = carName;
    }

    public boolean isCarNameCollect() {
        if (carName.length() > 5 ) {
            throw new IllegalArgumentException();
        }

        return true;
    }

    void goOrStop (CarStatus carStatus) {
        if (carStatus == CarStatus.GO) {
            moveDistance++;
        }
    }

    private String MoveDistanceString() {
        String moveDistanceString = "";

        for (int i = 0; i < moveDistance; i++) {
            moveDistanceString += "-";
        }
        return moveDistanceString;
    }

    public String printStatusString() {
        return carName + ":" + MoveDistanceString();
    }

    public int getMoveDistance() {
        return moveDistance;
    }

    public String getCarName() {
        return carName;
    }
}
