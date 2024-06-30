package com.leonardo.learning_java_ee.control;

import java.util.UUID;

import com.leonardo.learning_java_ee.entity.Car;
import com.leonardo.learning_java_ee.entity.Specification;

public class CarFactory {
	public Car createCar(Specification specification) {
		Car car = new Car();
		car.setIdentifier(UUID.randomUUID().toString());
		car.setColor(specification.getColor());
		car.setEngineType(specification.getEngineType());
		return car;
	}
}
