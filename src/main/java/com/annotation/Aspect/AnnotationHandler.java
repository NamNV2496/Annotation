package com.annotation.Aspect;

import com.annotation.config.AnnotationConfig;
import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.List;

@Aspect
@Component
public class AnnotationHandler {
    List<String> roles = List.of("ADMIN", "MEMBER");

    @Pointcut("execution(* com.annotation.controller.ExampleController.*(..))")
    public void executionAnnotation() {}

    @Around("executionAnnotation()")
    public void executionAnnotationHandle() {
        System.out.println("execute controller from ExampleController");
    }

    @Pointcut("within(com.annotation..*)  && @annotation(com.annotation.config.AnnotationConfig)")
    public void repositoryClassMethods() {
    }

    @SneakyThrows
    @Around("repositoryClassMethods()")
    public void measureMethodExecutionTime(ProceedingJoinPoint call ) {
        MethodSignature signature = (MethodSignature) call.getSignature();
        Method method = signature.getMethod();

        AnnotationConfig myAnnotation = method.getAnnotation(AnnotationConfig.class);

            if (!roles.contains(myAnnotation.hasRoles())) {
                throw new Exception("FAIl");
            }
            System.out.println("Role: " + myAnnotation.hasRoles());
    }
}
