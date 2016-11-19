import me.lukawski.skvs.operations.Operation;
import me.lukawski.skvs.operations.Operations;
import me.lukawski.skvs.operations.implementations.AddOperation;
import me.lukawski.skvs.operations.implementations.GetOperation;
import me.lukawski.skvs.operations.results.InformationOperationResult;
import me.lukawski.skvs.operations.OperationResult;
import me.lukawski.skvs.operations.results.ValueOperationResult;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by EvilRIS on 18.11.2016.
 */
public class OperationsTest {

    public static final String GET_OPERATION = "GET";
    public static final String ADD_OPERATION = "ADD";

    @Test
    public void operationsReturnPutOperationFromPutString(){
        Operation probablyAddOperation = Operations.getOperationByName(ADD_OPERATION);
        assertEquals(AddOperation.class, probablyAddOperation.getClass());
    }

    @Test
    public void operationsReturnGetOperationFromGetString(){
        Operation probablyGetOperation = Operations.getOperationByName(GET_OPERATION);
        assertEquals(GetOperation.class, probablyGetOperation.getClass());
    }

    @Test
    public void operationsAlwaysReturnSameInstanceOfOperation(){
        assertEquals("GET OPERATION",Operations.getOperationByName(GET_OPERATION),Operations.getOperationByName(GET_OPERATION));
        assertEquals("GET OPERATION",Operations.getOperationByName(ADD_OPERATION),Operations.getOperationByName(ADD_OPERATION));
    }

    @Test
    public void operationAddReturnInformationResault(){
        String[] operationParameters = new String[1];
        operationParameters[0] = "Test";
        Operation getOperation = Operations.getOperationByName(GET_OPERATION);
        OperationResult result = getOperation.execute(operationParameters);
        assertEquals(InformationOperationResult.class, result.getClass());
    }

    @Test
    public void operationGetReturnValueResault(){
        String[] operationParameters = new String[1];
        operationParameters[0] = "Klucz";
        Operation addOperation = Operations.getOperationByName(ADD_OPERATION);
        OperationResult result = addOperation.execute(operationParameters);
        assertEquals(ValueOperationResult.class, result.getClass());
    }


    @Test
    public void operation(){

    }
}
