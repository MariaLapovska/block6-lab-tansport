package com.epam.vehicles;

import com.epam.track.Track;

/**
 * Created by Asus on 20.05.2016.
 */
public abstract class Vehicle implements Movable {

    private int maxSpeed;
    private int maxWeight;
    private String numPlateFormat;

    private int speed;
    private int weight;
    private String model;
    private String numPlate;
    private Color color;

    public Vehicle() {}

    public Vehicle(int maxSpeed, int maxWeight, String numPlateFormat, int speed, int weight,
                   String model, String numPlate, Color color) {
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
        this.numPlateFormat = numPlateFormat;

        checkSpeed(speed);
        checkWeight(weight);
        checkNumPlate(numPlate);

        this.speed = speed;
        this.weight = weight;
        this.model = model;
        this.numPlate = numPlate;
        this.color = color;
    }

    public void checkSpeed(int speed) {
        if (speed > maxSpeed) {
            throw new IllegalArgumentException("Max speed allowed is " + maxSpeed);
        }
    }

    public void checkWeight(int weight) {
        if (weight > maxWeight) {
            throw new IllegalArgumentException("Max weight allowed is " + maxWeight);
        }
    }

    public void checkNumPlate(String numPlate) {
        if (!numPlate.matches(numPlateFormat)) {
            throw new IllegalArgumentException("Wrong numberplate format");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        checkSpeed(speed);

        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        checkWeight(weight);

        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumPlate() {
        return numPlate;
    }

    public void setNumPlate(String numPlate) {
        checkNumPlate(numPlate);

        this.numPlate = numPlate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //TODO
    @Override
    public void move(Track track) {
        Movable.super.move(track);
        System.out.println("I am moving with the speed " + speed);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", number plate='" + numPlate + '\'' +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Vehicle vehicle = (Vehicle) object;

        if (speed != vehicle.speed) {
            return false;
        }
        if (weight != vehicle.weight) {
            return false;
        }
        if (model != null ? !model.equals(vehicle.model) : vehicle.model != null) {
            return false;
        }
        if (numPlate != null ? !numPlate.equals(vehicle.numPlate)
                             : vehicle.numPlate != null) {
            return false;
        }
        if (color != null ? !color.equals(vehicle.color) : vehicle.color != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = speed;

        result = prime * result + weight;
        result = prime * result + (model != null ? model.hashCode() : 0);
        result = prime * result + (numPlate != null ? numPlate.hashCode() : 0);
        result = prime * result + (color != null ? color.hashCode() : 0);

        return result;
    }
}