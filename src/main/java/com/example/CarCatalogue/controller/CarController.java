package com.example.CarCatalogue.controller;

import com.example.CarCatalogue.model.Car;
import com.example.CarCatalogue.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class CarController {
    private final CarService carService;

    @GetMapping("/car")
    public List<Car> getAll (){

        return  carService.getAll();
    }

    @GetMapping("/car/{id}")
    public Car getOneById (@PathVariable Long id){
        return carService.getOneById(id);
    }
    @PostMapping("/car")
    public void addCar (@RequestBody Car car){
        carService.addCar(car);
    }
}
