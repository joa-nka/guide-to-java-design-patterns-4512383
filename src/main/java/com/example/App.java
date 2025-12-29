package com.example;

public class App {

    public static void main(String[] args) {
        var light = new Light();

        var lightOperationExecutor = new LightOperationExecutor();

        lightOperationExecutor.queueOperation(new CheckLightOperation(light));
        lightOperationExecutor.queueOperation(new TurnLightOnOperation(light));
        lightOperationExecutor.queueOperation(new CheckLightOperation(light));
        lightOperationExecutor.queueOperation(new TurnLightOffOperation(light));
        lightOperationExecutor.queueOperation(new CheckLightOperation(light));

        lightOperationExecutor.execute();

        }

    }

