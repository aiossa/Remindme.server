package com.qoobico.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 * Created by Aleksandr on 24.01.2016.
 */

@Configuration
@EnableJpaRepositories("com.qoobico.remindme.server.repository")
@EnableTransactionManagement
@ComponentScan("com.qoobico.remindme.server")
@PropertySource("classpath:db.properties")
public class DataBaseConfig {

    @Resource
    private Environment env;

}
