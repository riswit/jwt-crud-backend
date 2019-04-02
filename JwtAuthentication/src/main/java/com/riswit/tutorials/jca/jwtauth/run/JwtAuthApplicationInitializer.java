package com.riswit.tutorials.jca.jwtauth.run;

import com.riswit.tutorials.jca.common.app.CommonAppInitializer;
import com.riswit.tutorials.jca.jwtauth.config.JwtAuthConfig;

public class JwtAuthApplicationInitializer extends CommonAppInitializer {

    @Override
    protected Class<?> getRootConfigClass() {
        return JwtAuthConfig.class;
    }

}
