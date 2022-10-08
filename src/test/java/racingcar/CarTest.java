package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CarTest {

    @Test
    void enterCarNameTest() {
        Car newCar = new Car("abcdef");
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(newCar::isCarNameCollect);
    }
}
