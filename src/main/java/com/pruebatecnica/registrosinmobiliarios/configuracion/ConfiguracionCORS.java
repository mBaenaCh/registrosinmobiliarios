package com.pruebatecnica.registrosinmobiliarios.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfiguracionCORS implements WebMvcConfigurer {

    public static String FRONT_URL = "http://localhost:3000";
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedMethods("OPTIONS", "GET", "POST", "PUT", "DELETE")
                .allowedOrigins(FRONT_URL)
                .allowedHeaders("*");
    }
}
