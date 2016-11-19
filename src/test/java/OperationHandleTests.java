import me.lukawski.skvs.operations.OperationResult;
import me.lukawski.skvs.store.StoreHandler;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by EvilRIS on 18.11.2016.
 */
public class OperationHandleTests {

    public static final String OK_MESSAGE = "OK";
    public static String add_message = "ADD KEY VALUE";
    public static String get_message = "GET KEY";
    @Test
    public void addToStoreReturnOK(){
        StoreHandler store = StoreHandler.getLocalInstance();
        OperationResult result = store.process(add_message);
        Assert.assertEquals(result.getOperationMesage(), OK_MESSAGE);
    }

    @Test
    public void addThenGetSameItemFromStore(){
        StoreHandler store = StoreHandler.getLocalInstance();
        OperationResult result = store.process(add_message);
        OperationResult getResult = store.process(get_message);
        Assert.assertEquals("VALUE",getResult.getValue());

    }

}

