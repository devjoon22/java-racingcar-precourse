package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class CarsInRaceTest {

    @Test
    void enterCarsNameInRaceTest() {

        CarsInRace cars = new CarsInRace("abcdef,abcdef");

        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {cars.areCarsNameCollect();});
    }
}
