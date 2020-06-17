package com.android.uraall.dependencyinjectiondemo;

import android.util.Log;

import javax.inject.Inject;

public class LithiumIonBattery implements CarBattery {

    private static final String TAG = "CarTag";

    @Inject
    public LithiumIonBattery() {
    }

    @Override
    public void logBatteryType() {
        Log.d(TAG, "This is a Lithium-Ion Battery");
    }
}
