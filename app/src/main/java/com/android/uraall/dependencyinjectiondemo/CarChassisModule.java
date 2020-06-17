package com.android.uraall.dependencyinjectiondemo;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class CarChassisModule {

    private int weight;
    private static final String TAG = "CarTag";

    public CarChassisModule(int weight) {
        this.weight = weight;
    }

    @Provides
    CarChassis provideCarChassis() {

        Log.d(TAG, "Car chassis weight is " + weight);
        return new CarChassis();

    }

}
