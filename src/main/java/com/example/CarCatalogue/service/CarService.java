package com.example.CarCatalogue.service;


import com.example.CarCatalogue.model.Car;
import com.example.CarCatalogue.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CarService {
    private final CarRepository carRepository;

    public List<Car> getAll() {
        return carRepository.findAll();
    }

    public Car getOneById(Long id) {
        return carRepository.getById(id);
    }

    public void addCar(Car car) {
        carRepository.save(car);
    }
}
