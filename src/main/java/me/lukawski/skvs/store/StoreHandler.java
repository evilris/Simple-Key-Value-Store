package me.lukawski.skvs.store;

import com.google.common.base.Strings;
import me.lukawski.skvs.operations.Operation;
import me.lukawski.skvs.operations.OperationResult;
import me.lukawski.skvs.operations.Operations;
import me.lukawski.skvs.operations.results.InformationOperationResult;

/**
 * Created by EvilRIS on 18.11.2016.
 */
public class StoreHandler {
    private KeyValueStore<String,Object> store;

    public StoreHandler(){
        this.store = new KeyValueStore<String,Object>();
    }
    public static StoreHandler getLocalInstance() {
        return new StoreHandler();
    }



    public OperationResult process(String add_message) {
        Operation operation = getOperationFromMessage(add_message);
        return handleOperation(operation);
    }

    private Operation getOperationFromMessage(String add_message) {
        String operatoinName = getOperationNameFromMessage(add_message);
        return Operations.getOperationByName(operatoinName);
    }

    private InformationOperationResult handleOperation(Operation operation) {
        return new InformationOperationResult("OK","VALUE");
    }

    private String getOperationNameFromMessage(String add_message) {
        if (!Strings.isNullOrEmpty(add_message))
            return add_message.split("\\s+")[0];
        else return Operations.NO_OPERATION_NAME;
    }
}
