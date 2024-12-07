package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    public CarServiceImpl() {
        this.carList = new ArrayList<>();

        carList.add(new Car("BMW", "M3", 8_900_000));
        carList.add(new Car("Audi", "RS6", 14_200_000));
        carList.add(new Car("Tesla", "Model S", 6_590_000));
        carList.add(new Car("Lada", "Aura", 2_700_000));
        carList.add(new Car("Moskvich", "3", 1_900_000));
    }

    public CarServiceImpl(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> byCount(int count) {
        return carList.subList(0, Math.min(count, carList.size()));
    }
}