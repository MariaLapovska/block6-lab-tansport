package com.epam.track;

import com.epam.vehicles.*;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Asus on 20.05.2016.
 */
public class Track {

    public static final int MAX_TRACK_NUM = 2000;

    private ArrayList<Movable> passedMovables = new ArrayList<>();
    private int trackNum;

    public Track(int trackNum) {
        this.trackNum = trackNum;
    }

    public void ride(Movable movable) {
        passedMovables.add(movable);
    }

    public ArrayList<Movable> getPassedMovables() {
        return passedMovables;
    }

    public void setPassedMovables(ArrayList<Movable> passedMovables) {
        this.passedMovables = passedMovables;
    }

    public int getTrackNum() {
        return trackNum;
    }

    public void setTrackNum(int trackNum) {
        if (trackNum > MAX_TRACK_NUM) {
            throw new IllegalArgumentException("Max track number is " + MAX_TRACK_NUM);
        }

        this.trackNum = trackNum;
    }

    public int getMovablesCounter() {
        return passedMovables.size();
    }

    public int getVehicleCounter(Class type) {
        int counter = 0;

        for (Movable movable : passedMovables) {
            if (movable instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) movable;

                if (vehicle.getClass() == type) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public ArrayList<Vehicle> findVehiclesByModel(String model, Class type) {
        ArrayList<Vehicle> found = new ArrayList<>();

        for (Movable movable : passedMovables) {
            if (movable instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) movable;

                if (vehicle.getClass() == type) {
                    if (vehicle.getModel().equals(model)) {
                        found.add(vehicle);
                    }
                }
            }
        }

        return found;
    }

    public Vehicle findVehicleByNumPlate(String numPlate, Class type) {
        for (Movable movable : passedMovables) {
            if (movable instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) movable;

                if (vehicle.getClass() == type) {
                    if (vehicle.getNumPlate().equals(numPlate)) {
                        return vehicle;
                    }
                }
            }
        }

        return null;
    }
}
