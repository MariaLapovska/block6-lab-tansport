package com.epam.vehicles;

import com.epam.track.Track;

/**
 * Created by Asus on 20.05.2016.
 */
public class Truck extends Vehicle {

    public static final int MAX_SPEED = 300;
    public static final int MAX_WEIGHT = 30000;
    public static final String NUM_PLATE_FORMAT = "[A-Z]{2}[0-9]{4}[A-Z]{2}";

    public Truck(int speed, int weight, String model,
                 String numPlate, Color color) {
        super(MAX_SPEED, MAX_WEIGHT, NUM_PLATE_FORMAT,
                speed, weight, model, numPlate, color);
    }

    //TODO
    @Override
    public void move(Track track) {
        super.move(track);
        System.out.println("I am a truck");
    }
}
