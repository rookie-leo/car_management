package com.leonardo.learning_java_ee.boundary;

import com.leonardo.learning_java_ee.entity.Car;
import com.leonardo.learning_java_ee.entity.Specification;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("cars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarResource {
    @Inject
    CarManufacturer carManufacturer;

    @GET
    public List<Car> retrieveCars() { return carManufacturer.retrieveCars(); }

    @POST
    public void createCar(Specification specification) { carManufacturer.manufacturerCar(specification); }
}
