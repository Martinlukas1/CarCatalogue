package com.example.CarCatalogue.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarDTO {

    private Long id;
    private String name;
    private String brand;

}
