package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private CarDaoImpl carDao = new CarDaoImpl();


    @Override
    public List<Car> createCarList() {
        return carDao.createCarList();
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        return carDao.getCarsByCount(count);
    }
}
