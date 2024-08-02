package com.bhawna.SpringBoot.Week4Task.Currency.Converter.configs;

import org.modelmapper.ModelMapper;
import org.springframework.boot.Banner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "getAuditAwareImpl")
public class MapperConfig {

    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
