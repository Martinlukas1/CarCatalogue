package com.example.CarCatalogue.utils;

import com.example.CarCatalogue.model.Car;
import com.example.CarCatalogue.model.CarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface CarMapper {

//    Car mapCarDtoToCar(CarDTO carDTO);
    CarDTO mapCarToCarDto (Car car);
    @Mapping(target = "id",ignore = true)
    Car mapCarDTOtoCarEntity (CarDTO carDTO);
    List<Car> mapCarDtoListToCarList (List <CarDTO> list);
    List<CarDTO> mapCarListToCarDTOList (List <Car> list);
}
