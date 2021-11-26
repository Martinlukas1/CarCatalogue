package com.example.CarCatalogue.repository;

import com.example.CarCatalogue.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository <Car, Long>{
}
