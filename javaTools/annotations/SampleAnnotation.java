package javaTools.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

public class SampleAnnotation {

    public static void main(String [] args) throws Exception{
        AnCat aCat = new AnCat("tom Jones");
        if(aCat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println(aCat.getClass().getName() + " is a Very Important class");
        } else {
            System.out.println(aCat.getClass().getName() + " is Not a Very Important class.");
        }
        System.out.println("-------------------------------------");

        for(Method method : aCat.getClass().getDeclaredMethods() ){
            if(method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for(int i = 0; i < annotation.times(); i++){
                    method.invoke(aCat);
                }

            }
        }
        System.out.println("-------------------------------------");

        for(Field field : aCat.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(ImportantString.class)){
                Object objectVal = field.get(aCat);
                if( objectVal instanceof String stringValue){
                    System.out.println(stringValue.toUpperCase());
                }
            }
        }
    }

}
