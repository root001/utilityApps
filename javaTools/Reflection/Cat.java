package javaTools.Reflection;

public class Cat {

    private final String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int setAge(){
        return age;
    }

    public void catSound(){
        System.out.println("Cat says meow.");
    }

    private void heyPrivate(){
        System.out.println("this is private.");
    }

    public static void heyPublicStatic(){
        System.out.println("this is a public static meth.");
    }

    private static void heyPrivateStatic(){
        System.out.println("this is private static.");
    }
}
