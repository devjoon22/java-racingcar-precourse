package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Car {
    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public boolean isCarNameCollect() {
        if (carName.length() > 5 ) {
            throw new IllegalArgumentException();
        }

        return true;
    }
}
