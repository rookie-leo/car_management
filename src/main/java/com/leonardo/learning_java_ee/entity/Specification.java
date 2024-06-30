package com.leonardo.learning_java_ee.entity;

import com.leonardo.learning_java_ee.entity.enums.Color;

public class Specification {
	private final Color color;
	private final EngineType engineType;
	
	public Specification(Color color, EngineType engineType) {
		this.color = color;
		this.engineType = engineType;
	}

	public Color getColor() {
		return color;
	}

	public EngineType getEngineType() {
		return engineType;
	}
}
