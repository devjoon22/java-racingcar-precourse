package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class ProgressStep {
    String stepNumberString;

    public ProgressStep(String stepNumberString) {
        this.stepNumberString = stepNumberString;
    }

    public boolean isCollectStepNumber() throws NumberFormatException {
        Integer.parseInt(stepNumberString);

        return true;
    }
}
