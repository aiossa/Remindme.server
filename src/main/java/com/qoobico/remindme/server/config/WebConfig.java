package com.qoobico.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Aleksandr on 24.01.2016.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.qoobico.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
