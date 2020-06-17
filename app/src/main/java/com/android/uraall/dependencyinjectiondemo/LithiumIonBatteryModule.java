package com.android.uraall.dependencyinjectiondemo;

import dagger.Module;
import dagger.Provides;

@Module
public class LithiumIonBatteryModule {

    @Provides
    CarBattery provideCarBattery(LithiumIonBattery lithiumIonBattery) {

        lithiumIonBattery.logBatteryType();
        return lithiumIonBattery;
    }

}
