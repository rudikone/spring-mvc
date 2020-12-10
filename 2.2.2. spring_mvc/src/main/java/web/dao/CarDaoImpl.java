package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> createCarList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Black", "BMW", "X5"));
        list.add(new Car("White", "Lada", "Granta"));
        list.add(new Car("Yellow", "Mercedes", "GLK-100"));
        list.add(new Car("Red", "Opel", "Astra"));
        list.add(new Car("Blue", "Skoda", "Yeti"));
        return list;
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        List<Car> list = createCarList();
        if (count <= 0 ) {
            count = 0;
        }
        if (count > 5) {
            count = 5;
        } else {
            count = count;
        }
        return list.subList(0, count);
    }
}
