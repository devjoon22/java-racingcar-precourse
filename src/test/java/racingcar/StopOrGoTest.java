package racingcar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StopOrGoTest {
    @Test
    void stopOrGoTest() {
        int carStatusNum = CarStatus.stopOrGo().ordinal();
        assertTrue(carStatusNum >= 0 && carStatusNum <= 1);
    }
}
