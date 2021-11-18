package com.cg.aloc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.cg.aloc.controller.DemoController;

import lombok.Generated;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages={"com.cg"})
public class MainAdminDetailApplication{
	@Generated
    public static void main(String[] args) {
        SpringApplication.run(MainAdminDetailApplication.class);
    }  
}


