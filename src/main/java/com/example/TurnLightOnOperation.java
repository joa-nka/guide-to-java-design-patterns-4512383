package com.example;

public class TurnLightOnOperation implements LightOperation {

    private final Light light;

    public TurnLightOnOperation(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOnLight();
    }

}
