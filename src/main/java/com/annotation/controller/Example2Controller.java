    package com.annotation.controller;

import com.annotation.config.AnnotationConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Example2Controller {
        @AnnotationConfig(hasRoles ="ADMIN")
        @GetMapping("/set")
        public void set() {
            System.out.println("get");
        }

        @AnnotationConfig(hasRoles ="GUEST")
        @GetMapping("/set2")
        public void set2() {
            System.out.println("get2");
        }

    }
