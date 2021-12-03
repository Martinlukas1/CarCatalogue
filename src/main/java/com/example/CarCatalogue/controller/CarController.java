package com.example.CarCatalogue.controller;

import com.example.CarCatalogue.model.Car;
import com.example.CarCatalogue.model.CarDTO;
import com.example.CarCatalogue.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class CarController {
    private final CarService carService;

    @GetMapping("/car")
    public List<CarDTO> getAll (){
        return  carService.getAll();
    }

    @GetMapping("/test")
    public void test (){
        carService.test();
    }

    @GetMapping("/car/{id}")
    public Car getOneById (@PathVariable Long id){
        return carService.getOneById(id);
    }

    @PostMapping("/new_car")
    public void addCar (@RequestBody CarDTO car){
        carService.addCar(car);
    }

    @DeleteMapping ("/delete/{id}")
    public void deleteOneById (@PathVariable Long id){
        carService.deleteById(id);
    }

}
