package javaTools.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Target to specify what type of element it to be visible on. ElementType.TYPE -> valid for classes
// {ElementType.TYPE, ElementType.METHOD}
// RetentionPolicy.RUNTIME -> Annotation is kept through the running of the program
// RetentionPolicy.SOURCE -> Removed at source before compilation e.g supress warning annotation
// RetentionPolicy.RUNTIME -> Kept through runtime and can be accessed while the program is running using reflection
@Target( {ElementType.TYPE, ElementType.METHOD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportant {
}
