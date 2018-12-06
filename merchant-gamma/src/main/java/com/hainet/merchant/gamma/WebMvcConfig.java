package com.hainet.merchant.gamma;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebMvcConfig {

    @Bean
    public RestTemplate restTemplate(final RestTemplateBuilder builder) {
        return builder
                .rootUri("http://localhost:8080")
                .build();
    }
}
