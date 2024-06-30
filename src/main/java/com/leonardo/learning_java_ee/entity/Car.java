package com.leonardo.learning_java_ee.entity;

import com.leonardo.learning_java_ee.entity.enums.Color;

public class Car {
	private String identifier;
	private Color color;
	private EngineType engineType;
	
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public EngineType getEngineType() {
		return engineType;
	}
	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}
	
	
}
