package javaTools.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTuts {

    public static void main(String [] args) throws Exception{
        Cat cats = new Cat("Stan", 21 );
        Field[] fields = cats.getClass().getDeclaredFields();

        for(Field field : fields){
            if ("name".equalsIgnoreCase(field.getName())){
                field.setAccessible(true);
                field.set(cats, "McQueen");
            }
    //        System.out.println("Field Name :  "+field.getName() );
        }

        Method[] methods = cats.getClass().getMethods();
        for(Method method : methods){
            if ("catSound".equalsIgnoreCase(method.getName())){
                method.invoke(cats);
            }
            if ("heyPrivateStatic".equalsIgnoreCase(method.getName())) {
                // setting accessible to true has no effect for this version of java for private methods, implementation probably changed.
                method.setAccessible(true);
                method.invoke(null);
           // either works for public static methods
                // method.invoke(cats);
            }

        }
   //     System.out.println("Cat's Name is :  "+cats.getName());
    }
// Spring frame works uses reflection a lot, for scanning and injection of methods.
    // Can be used in tests when the methods are private and we still want to test this.
}
