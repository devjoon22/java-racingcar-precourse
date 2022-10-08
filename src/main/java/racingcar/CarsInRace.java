package racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class CarsInRace {
    private final List<Car> cars;

    public CarsInRace(String carsNameString) {
        String[] carsNameArray = carsNameString.split(",");
        cars = Arrays.stream(carsNameArray).map((carName) -> new Car(carName)).collect(Collectors.toList());
    }

    public void areCarsNameCollect() {
        cars.forEach(Car::isCarNameCollect);
        throw new IllegalArgumentException("차 이름은 5자 이하입니다");
    }
}
