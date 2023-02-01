package com.prostopizza;

import com.prostopizza.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public abstract class ProstopizzaApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(ProstopizzaApplication.class, args);
    }

}
