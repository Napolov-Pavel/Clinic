package com.example.clinic;

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClinicApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
    @Bean
    public LayoutDialect layoutDialect() { return new LayoutDialect();}

    public static void main(String[] args) {
        SpringApplication.run(ClinicApplication.class, args);
    }

}
