package me.lukawski.skvs.operations.implementations;

import me.lukawski.skvs.operations.Operation;
import me.lukawski.skvs.operations.OperationResult;
import me.lukawski.skvs.operations.results.ValueOperationResult;

/**
 * Created by EvilRIS on 18.11.2016.
 */
public class AddOperation implements Operation {
    @Override
    public OperationResult execute(String[] operationParameters) {
        return new ValueOperationResult();
    }
}
