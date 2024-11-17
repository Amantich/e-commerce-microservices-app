package org.example.customersmicroservice.config;

import org.example.customersmicroservice.entities.Customer;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


/**
 * @author tensa
 **/
@Configuration
public class RepositoryRestConfigurerImp implements RepositoryRestConfigurer {


    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
        config.exposeIdsFor(Customer.class);
    }
}
