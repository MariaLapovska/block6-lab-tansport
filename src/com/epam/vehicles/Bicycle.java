package com.epam.vehicles;

import com.epam.track.Track;

/**
 * Created by Asus on 20.05.2016.
 */
public class Bicycle implements Movable {

    private String model;
    private Color color;

    public Bicycle(String model, Color color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void move(Track track) {
        Movable.super.move(track);
        System.out.println("I am a " + color + " bicycle");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
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

        Bicycle bicycle = (Bicycle) object;

        if (model != null ? !model.equals(bicycle.model) : bicycle.model != null) {
            return false;
        }
        if (color != null ? !color.equals(bicycle.color) : bicycle.color != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = (model != null ? model.hashCode() : 0);

        result = prime * result + (color != null ? color.hashCode() : 0);

        return result;
    }
}