package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        CarServiceImpl carService = new CarServiceImpl();
        if(count == null){
            count = 5;
        }
        List<Car> cars = carService.getCarsByCount(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
