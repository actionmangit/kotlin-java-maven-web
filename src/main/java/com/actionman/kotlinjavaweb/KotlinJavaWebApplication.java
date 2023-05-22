package com.actionman.kotlinjavaweb;

import com.action.kotlinjavacore.service.JavaService;
import com.action.kotlinjavacore.service.KotlinService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.action.kotlinjavacore")
public class KotlinJavaWebApplication {

    public KotlinJavaWebApplication(KotlinService kotlinService, JavaService javaService) {
        this.kotlinService = kotlinService;
        this.javaService = javaService;
    }

    private final KotlinService kotlinService;
    private final JavaService javaService;

    public static void main(String[] args) {
        SpringApplication.run(KotlinJavaWebApplication.class, args);
    }

    public void start() {
        kotlinService.sayHello();
        javaService.sayHello();
    }
}
