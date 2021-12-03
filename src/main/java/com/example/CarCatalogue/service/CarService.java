package com.example.CarCatalogue.service;


import com.example.CarCatalogue.model.Car;
import com.example.CarCatalogue.model.CarDTO;
import com.example.CarCatalogue.repository.CarRepository;
import com.example.CarCatalogue.utils.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CarService {
    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public List<CarDTO> getAll() {
        return carMapper.mapCarListToCarDTOList(carRepository.findAll());
    }

    public Car getOneById(Long id) {
        return carRepository.getById(id);
    }

    public void addCar(CarDTO car) {
        carRepository.save(carMapper.mapCarDTOtoCarEntity(car));
    }

    public Car setNewValue (Long id, String name, String brand){
        Car car = carRepository.getById(id);
        car.setName(name);
        car.setBrand(brand);
        return car;
    }

    public void deleteById (Long id){
        carRepository.deleteById(id);
    }


    public void test() {
        Car car = Car.builder().brand("Toyota").name("Yaris").build();
        carRepository.save(car);
    }
}
