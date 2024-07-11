package com.leonardo.learning_java_ee.control;

import com.leonardo.learning_java_ee.entity.enums.Color;

import javax.enterprise.inject.Produces;

public class DefaultColorExposed {

    @Produces
    @Diesel
    public Color exposeDefaultColor() {
        return Color.GREY;
    }

}
