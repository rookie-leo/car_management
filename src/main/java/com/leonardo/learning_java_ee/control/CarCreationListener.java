package com.leonardo.learning_java_ee.control;

import com.leonardo.learning_java_ee.entity.CarCreated;

import javax.enterprise.event.Observes;

public class CarCreationListener {

    public void onCarCreation(@Observes CarCreated carCreated) {
        System.out.println("New car created with id: " + carCreated.getIdentifier());
    }

}
