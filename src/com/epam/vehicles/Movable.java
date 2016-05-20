package com.epam.vehicles;

import com.epam.track.Track;

/**
 * Created by Asus on 20.05.2016.
 */
public interface Movable {

    default void move(Track track) {
        System.out.println("***");
        System.out.println("I moved on track #" + track.getTrackNum());
        track.ride(this);
    }
}
