package me.lukawski.skvs.store;

import me.lukawski.skvs.operations.OperationResult;
import me.lukawski.skvs.operations.results.InformationOperationResult;

/**
 * Created by EvilRIS on 18.11.2016.
 */
public class StoreHandler {
    public static StoreHandler getLocalInstance() {
        return new StoreHandler();
    }

    public OperationResult process(String add_message) {
        return new InformationOperationResult("OK");
    }
}
