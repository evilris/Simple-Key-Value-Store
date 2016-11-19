import me.lukawski.skvs.store.KeyValueStore;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by EvilRIS on 19.11.2016.
 */
public class StoreTests {

    @Test
    public void putAndGetFromStore(){
        KeyValueStore<String,Object> store = new KeyValueStore<>();
        store.put("KEY","VALUE");
        Assert.assertEquals("VALUE",store.get("KEY"));
    }
}
