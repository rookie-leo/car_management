package com.leonardo.learning_java_ee.boundary;

import com.leonardo.learning_java_ee.control.CarFactory;
import com.leonardo.learning_java_ee.control.CarRepository;
import com.leonardo.learning_java_ee.entity.Car;
import com.leonardo.learning_java_ee.entity.CarCreated;
import com.leonardo.learning_java_ee.entity.EngineType;
import com.leonardo.learning_java_ee.entity.Specification;
import com.leonardo.learning_java_ee.entity.enums.Color;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

@Stateless
public class CarManufacturer {

	@Inject
	CarFactory carFactory;

	@Inject
	CarRepository carRepository;

	@Inject
	Event<CarCreated> carCreated;
	
	public Car manufacturerCar(Specification specification) {
		Car car = carFactory.createCar(specification);
		
		carRepository.store(car);

		carCreated.fire(new CarCreated(car.getIdentifier()));

		return car;
	}


	public List<Car> retrieveCars() {
//		return carRepository.retrieveCars();
		return Arrays.asList(carFactory
				.createCar(
						new Specification(Color.BLACK, EngineType.PETROL)
				));
	}
}
