package com.alancamargo.cvbackend.di;

import com.alancamargo.cvbackend.service.ContactInfoService;
import com.alancamargo.cvbackend.service.ContactInfoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ContactInfoService provideContactInfoService() {
        return new ContactInfoServiceImpl();
    }

}
