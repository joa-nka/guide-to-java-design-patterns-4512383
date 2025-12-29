package com.example;

import java.util.ArrayList;
import java.util.List;

public class LightOperationExecutor {

    List<LightOperation> lightOperations = new ArrayList<>();

    public void queueOperation(LightOperation lightOperation) {
        lightOperations.add(lightOperation);
    }

    public void execute() {
        lightOperations.forEach(LightOperation::execute);
        lightOperations.clear();
    }
}
