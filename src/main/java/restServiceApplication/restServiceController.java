package restServiceApplication;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

@RestController
public class restServiceController {

    private static final String template = "Hello, %s!";
    private static final String NAME = "name";
    private static final String WORLD = "World";
    private static final String GET_IP_ENDPOINT = "http://httpbin.org/ip";
    private final AtomicLong counter = new AtomicLong();
    private final RestTemplate restTemplate = new RestTemplate();
    private final Gson gson = new Gson();

    private IpInfo ipInfo = new IpInfo();

    /**
     * Greeting end point
     *
     * @param name optional String, 'World' by default
     * @return String with the greeting message
     */
    @RequestMapping("/greeting")
    public Greeting greeting(
        @RequestParam(value = NAME, defaultValue = WORLD)
            String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    /**
     * Get IP endpoint
     *
     * @return String with a message and the ip retrieved by a GET service
     */
    @RequestMapping("/getMyIP")
    public String getMyIP() {
        String jsonString = restTemplate.getForObject(GET_IP_ENDPOINT, String.class);
        ipInfo = gson.fromJson(jsonString, IpInfo.class);
        return ipInfo.getIp();
    }
}