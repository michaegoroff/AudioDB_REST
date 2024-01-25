package client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class AudioClientSettings implements IAudioClientSettings {

    @Value("${audiodb.api.host}")
    private String hostUrl;
    @Value("${audiodb.api.version}")
    private String apiVersion;
    @Value("${audiodb.api.key}")
    private String apiKey;
    @Override
    public String getHostUrl() {
        return hostUrl;
    }

    @Override
    public String getApiVersion() {
        return apiVersion;
    }

    @Override
    public String getApiKey() {
        return apiKey;
    }
}
