package client;

import org.springframework.web.util.UriComponentsBuilder;

public interface IAudioClientSettings {
    String getHostUrl();
    String getApiVersion();
    String getApiKey();

    default UriComponentsBuilder getUriBuilder(){
        return UriComponentsBuilder.newInstance()
                .scheme("https")
                .host(getHostUrl())
                .pathSegment("api")
                .pathSegment(getApiVersion())
                .pathSegment("json")
                .pathSegment(getApiKey());
    }

}
