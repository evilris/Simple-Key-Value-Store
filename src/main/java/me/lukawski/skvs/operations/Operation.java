package me.lukawski.skvs.operations;

/**
 * Created by EvilRIS on 18.11.2016.
 */
public interface Operation {

    OperationResult execute(String[] operationParameters);
}

