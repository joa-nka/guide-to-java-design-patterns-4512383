package com.example;

public class CheckLightOperation implements LightOperation {

    public final Light light;

    public CheckLightOperation(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.isOn();
    }
}
