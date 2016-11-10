package restServiceApplication;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

import com.google.gson.Gson;

/**
 * Test class for the IpInfoTest class
 */
public class IpInfoTest {

    private static final String TEST_JSON = "{\n" + "  \"origin\": \"92.8.107.187\"\n" + "}";
    private static final String TEST_RESPONSE = "Your IP get from the REST Service is: 92.8.107.187";

    private final Gson gson = new Gson();

    private IpInfo ipInfo = new IpInfo();

    @Test
    public void shouldDeliverProperMessage() {
        ipInfo = gson.fromJson(TEST_JSON, IpInfo.class);
        assertThat(ipInfo.getIp(), equalToIgnoringCase(TEST_RESPONSE));
    }
}