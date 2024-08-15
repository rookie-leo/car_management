package com.leonardo.learning_java_ee.boundary;

import com.leonardo.learning_java_ee.entity.EngineType;
import com.leonardo.learning_java_ee.entity.Specification;
import com.leonardo.learning_java_ee.entity.enums.Color;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.stream.JsonCollectors;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("cars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarResource {
    @Inject
    CarManufacturer carManufacturer;

    @GET
    public JsonArray retrieveCars() {
        return carManufacturer.retrieveCars()
                .stream()
                .map(car -> Json.createObjectBuilder()
                        .add("color", car.getColor().name())
                        .add("engine", car.getEngineType().name())
                        .add("id", car.getIdentifier())
                        .add("qualquer coisa", "pode ser adicionada")
                        .build())
                .collect(JsonCollectors.toJsonArray());
    }

    @POST
    public void createCar(JsonObject jsonObject) {
        Color color = Color.valueOf(jsonObject.getString("color"));
        EngineType engineType = EngineType.valueOf(jsonObject.getString("engine"));
        carManufacturer.manufacturerCar(new Specification(color, engineType));
    }
}
