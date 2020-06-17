package com.android.uraall.dependencyinjectiondemo;

import javax.inject.Inject;

class CarEngine {

    private EngineFlap engineFlap;

    @Inject
    public CarEngine(EngineFlap engineFlap) {
        this.engineFlap = engineFlap;
    }
}
