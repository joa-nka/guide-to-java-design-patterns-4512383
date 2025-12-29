package com.example;

public class TurnLightOffOperation implements LightOperation {

    private final Light light;

    public TurnLightOffOperation(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOffLight();
    }

}
