package me.lukawski.skvs.operations.results;

import me.lukawski.skvs.operations.OperationResult;

/**
 * Created by EvilRIS on 18.11.2016.
 */
public class InformationOperationResult implements OperationResult {

    private String returnMessage;


    public InformationOperationResult(String message){
        this.returnMessage = message;
    }
    @Override
    public String getOperationMesage() {
        return returnMessage;
    }
}
