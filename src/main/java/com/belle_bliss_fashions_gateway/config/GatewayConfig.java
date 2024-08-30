package com.belle_bliss_fashions_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("belle-bliss-fashions-user-service-1",r->r.path("/belle-bliss-user-service/**")
                        .uri("http://localhost:8001")).build();
    }
}
