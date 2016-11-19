package me.lukawski.skvs.operations.results;

import me.lukawski.skvs.operations.OperationResult;

/**
 * Created by EvilRIS on 18.11.2016.
 */
public class InformationOperationResult implements OperationResult {

    private final String returnValue;
    private String returnMessage;


    public InformationOperationResult(String message, String retunedValue) {
        this.returnMessage = message;
        this.returnValue = retunedValue;
    }
    @Override
    public String getOperationMesage() {
        return returnMessage;
    }

    @Override
    public String getValue() {
        return returnValue;
    }
}
