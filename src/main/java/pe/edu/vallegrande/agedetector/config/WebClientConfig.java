package pe.edu.vallegrande.agedetector.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${rapidapi.url}")
    private String RAPIDAPI_URL;

    @Value("${rapidapi.host}")
    private String RAPIDAPI_HOST;

    @Value("${rapidapi.apikey}")
    private String RAPIDAPI_APIKEY;

    @Bean
    public WebClient ageWebClient() {
        return WebClient.builder()
                .baseUrl(RAPIDAPI_URL)
                .defaultHeader("x-rapidapi-host", RAPIDAPI_HOST)
                .defaultHeader("x-rapidapi-key", RAPIDAPI_APIKEY)
                .defaultHeader("Content-Type", "application/json")
                .build();
    }
    
}
