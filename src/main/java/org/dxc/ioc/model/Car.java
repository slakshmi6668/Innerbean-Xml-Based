package org.dxc.ioc.model;

public class Car {
 private String model;
 private int years;
 private String colour;
 Driver driver;
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYears() {
	return years;
}
public void setYears(int years) {
	this.years = years;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public Driver getDriver() {
	return driver;
}
public void setDriver(Driver driver) {
	this.driver = driver;
}
 

}
