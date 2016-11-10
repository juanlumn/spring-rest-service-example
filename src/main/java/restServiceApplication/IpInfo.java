package restServiceApplication;

import com.google.gson.annotations.SerializedName;

/**
 * Class which serialize a field with a different name than the actual field name
 */
public class IpInfo {

    private static final String IP_MESSAGE = "Your IP get from the REST Service is: ";

    @SerializedName("origin")
    private String ip;

    public String getIp() {
        return IP_MESSAGE + ip;
    }
}
