package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("BMW", "M3", 8_900_000));
        carList.add(new Car("Audi", "RS6", 14_200_000));
        carList.add(new Car("Tesla", "Model S", 6_590_000));
        carList.add(new Car("Lada", "Aura", 2_700_000));
        carList.add(new Car("Moskvich", "3", 1_900_000));

    }

    public List<Car> getAllCars() {
        return carList;
    }

    public List<Car> byCount(int count) {
        return carList.subList(0, count);
    }
}