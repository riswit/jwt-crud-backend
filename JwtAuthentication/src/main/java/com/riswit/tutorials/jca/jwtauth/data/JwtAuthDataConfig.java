package com.riswit.tutorials.jca.jwtauth.data;

import com.riswit.tutorials.jca.common.data.config.CommonDataConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.riswit.tutorials.jca.jwtauth.repository"})
public class JwtAuthDataConfig extends CommonDataConfig {

    @Override
    protected String[] getEntityPackagesToScan() {
        return new String[]{""};
    }

}
