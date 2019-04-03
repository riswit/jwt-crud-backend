package com.riswit.tutorials.jca.common.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration

public class CommonConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolder() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
