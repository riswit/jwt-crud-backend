package com.riswit.tutorials.jca.jwtauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.riswit.tutorials.jca.common.app",
                               "com.riswit.tutorials.jca.common.app.config",
                               "com.riswit.tutorials.jca.common.data.config"})
@PropertySource({"classpath:database.properties",
                 "classpath:application.properties"})
public class JwtAuthConfig {
}
