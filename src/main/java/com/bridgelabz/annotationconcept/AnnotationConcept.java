package com.bridgelabz.annotationconcept;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class AnnotationConcept {
    public static void main(String[] args) throws IllegalAccessException {
        AnnoDemo annoDemo = new AnnoDemo(4);
        System.out.println(annoDemo.toString());
        Class<AnnoDemo> annoDemoClass = AnnoDemo.class;
        Field[] declaredFields = annoDemoClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(MyAnnotation.class)) {
                System.out.println(declaredField.getName());
                declaredField.set(annoDemo, 10);
/*Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
System.out.println(declaredAnnotations.length);
for (Annotation declaredAnnotation : declaredAnnotations) {
System.out.println(declaredAnnotation.annotationType());*/
            }
        }
        System.out.println(annoDemo.toString());
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR})
@interface MyAnnotation {
    String name() default "";
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR})
@interface MyAnnotation2 {
}

class AnnoDemo {
    @MyAnnotation(name = "avinash")
    public Integer number0;
    public Integer number1;
    public Integer number2;
    @MyAnnotation
    public Integer number3;
    public Integer number4;

    @MyAnnotation
    public AnnoDemo(@MyAnnotation Integer number) {
        this.number3 = number;
    }

    @MyAnnotation
    public void m1(@MyAnnotation String[] args) {

    }

    @Override
    public String toString() {
        return "AnnoDemo{" +
                "number0=" + number0 +
                ", number1=" + number1 +
                ", number2=" + number2 +
                ", number3=" + number3 +
                ", number4=" + number4 +
                '}';
    }
}