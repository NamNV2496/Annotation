    package com.annotation.controller;

import com.annotation.config.AnnotationConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @AnnotationConfig(hasRoles ="ADMIN")
    @GetMapping("/get")
    public void get() {
        System.out.println("get");
    }

    @AnnotationConfig(hasRoles ="GUEST")
    @GetMapping("/get2")
    public void get2() {
        System.out.println("get2");
    }

}
