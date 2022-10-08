package racingcar;

import java.util.Arrays;
import java.util.Comparator;
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

    public void allCarGoOrStop() {
        cars.stream().forEach((car -> {
            car.goOrStop(CarStatus.stopOrGo());
            System.out.println(car.printStatusString());
        }));
    }

    public String winnerString() {
        int maxMoveDistance = winnerMoveDistance();
        String winnerString = cars.stream().filter((car -> car.getMoveDistance() == maxMoveDistance))
                .map(car -> car.getCarName()).collect(Collectors.joining(","));

        return winnerString;
    }

    private int winnerMoveDistance() {
        Comparator<Car> comparatorByMoveDistance = Comparator.comparingInt(Car::getMoveDistance);
        return cars.stream().max(comparatorByMoveDistance).orElse(new Car("empty")).getMoveDistance();
    }
}
