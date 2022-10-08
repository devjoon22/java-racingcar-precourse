package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class CarsInRace {
    private List<Car> cars;

    public CarsInRace() {
        cars = new ArrayList<>();
    }

    public CarsInRace(String carsNameString) {
        String[] carsNameArray = carsNameString.split(",");
        cars = Arrays.stream(carsNameArray).map((carName) -> new Car(carName)).collect(Collectors.toList());
    }

    public boolean areCarsNameCollect() {
        try {
            cars.forEach(Car::isCarNameCollect);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

            return false;
        }

        return true;
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

    public void enterCarsName() {
        do
        {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String carsNameString = readLine();

            String[] carsNameArray = carsNameString.split(",");
            cars = Arrays.stream(carsNameArray).map((carName) -> new Car(carName)).collect(Collectors.toList());
        } while(!areCarsNameCollect());
    }
}
