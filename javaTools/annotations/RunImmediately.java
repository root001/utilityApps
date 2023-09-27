package javaTools.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RunImmediately {
    // can only be of type primitives, String or array
    // they act as a method but are actually like variables of a class
    // when a default value is set then the annotation method is optional when used.
    int times() default 1; // or int times();
}
