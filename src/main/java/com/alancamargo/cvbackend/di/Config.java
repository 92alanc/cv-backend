package com.alancamargo.cvbackend.di;

import com.alancamargo.cvbackend.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("unused")
@Configuration
public class Config {

    @Bean
    public ContactInfoService provideContactInfoService() {
        return new ContactInfoServiceImpl();
    }

    @Bean
    public JobService provideJobService() {
        return new JobServiceImpl();
    }

    @Bean
    public HeadlineService provideHeadlineService() {
        return new HeadlineServiceImpl();
    }
    
}
