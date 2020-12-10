package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {
    public List<Car> createCarList();
    public List<Car> getCarsByCount(Integer count);
}
