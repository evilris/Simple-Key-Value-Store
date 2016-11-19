package me.lukawski.skvs.operations;

import me.lukawski.skvs.operations.implementations.AddOperation;
import me.lukawski.skvs.operations.implementations.GetOperation;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by EvilRIS on 18.11.2016.
 */
public class Operations {
    public static final String NO_OPERATION_NAME = "NO";
    private static HashMap<String,Operation> operationsCache;

    static {
        operationsCache = new LinkedHashMap<>(10);
    }
    public static Operation getOperationByName(String operationName) {
        return getCached(operationName);
    }

    private static Operation getCached(String operationName) {
        if(!operationsCache.containsKey(operationName))
            operationsCache.put(operationName, getNewOperationInstanceByString(operationName));
        return operationsCache.get(operationName);

    }

    private static Operation getNewOperationInstanceByString(String operationName) {
        switch (operationName){
            case "ADD":
                return new AddOperation();
            case "GET":
                return new GetOperation();
            default:
                return null;
        }
    }
}
