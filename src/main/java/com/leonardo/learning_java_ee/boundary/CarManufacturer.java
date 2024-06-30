package com.leonardo.learning_java_ee.boundary;

import com.leonardo.learning_java_ee.control.CarFactory;
import com.leonardo.learning_java_ee.control.CarRepository;
import com.leonardo.learning_java_ee.entity.Car;
import com.leonardo.learning_java_ee.entity.Specification;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class CarManufacturer {

	@Inject
	CarFactory carFactory;

	@Inject
	CarRepository carRepository;
	
	public Car manufacturerCar(Specification specification) {
		Car car = carFactory.createCar(specification);
		
		carRepository.store(car);
		
		return car;
	}


}
