package com.android.uraall.dependencyinjectiondemo;

import dagger.Component;

@Component(modules = CarChassisModule.class)
public interface CarComponent {

    Car getCar();

}
