package org.example;

public class Sensor {
    private String location;
    private double reading;

    public String getLocation() {
        return location;
    }
    public double getReading() {
        return reading;
    }
    public Sensor(String location, double reading){
        if(reading>-50.0 && reading < 50.0) this.reading = reading;
        else this.reading = 0;
    }

}
