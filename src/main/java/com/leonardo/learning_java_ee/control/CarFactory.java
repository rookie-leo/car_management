package com.leonardo.learning_java_ee.control;

import com.leonardo.learning_java_ee.entity.Car;
import com.leonardo.learning_java_ee.entity.Specification;
import com.leonardo.learning_java_ee.entity.enums.Color;

import javax.inject.Inject;
import java.util.UUID;

public class CarFactory {

    @Inject
    @Diesel
    Color defaultColor;

    public Car createCar(Specification specification) {
        Car car = new Car();
        car.setIdentifier(UUID.randomUUID().toString());
        car.setColor(specification.getColor() == null ? defaultColor : specification.getColor());
        car.setEngineType(specification.getEngineType());
        return car;
    }
}
