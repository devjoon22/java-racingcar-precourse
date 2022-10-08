package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class ProgressStep {
    String stepNumberString;

    public ProgressStep(String stepNumberString) {
        this.stepNumberString = stepNumberString;
    }

    public boolean isCollectStepNumber() {
        try {
            Integer.parseInt(stepNumberString);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("[ERROR] 시도 횟수는 숫자여야 한다.");
        }

        return true;
    }

    public int progressStopToInt() {
        return Integer.parseInt(stepNumberString);
    }
}
