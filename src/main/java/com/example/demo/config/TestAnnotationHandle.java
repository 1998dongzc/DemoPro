package com.example.demo.config;

import java.lang.annotation.Annotation;

public class TestAnnotationHandle implements TestAnnotation{
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
