package com.android.uraall.dependencyinjectiondemo;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private CarEngine carEngine;
    private CarBattery carBattery;
    private CarChassis carChassis;
    private static final String TAG = "CarTag";

    @Inject
    public Car(CarEngine carEngine, CarBattery carBattery,
               CarChassis carChassis) {
        this.carEngine = carEngine;
        this.carBattery = carBattery;
        this.carChassis = carChassis;
    }

    public void setCarChassis(CarChassis carChassis) {
        this.carChassis = carChassis;
    }

    public void move() {
        Log.d(TAG, "Car is moving");
    }
}
