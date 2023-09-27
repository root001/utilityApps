package javaTools.annotations;

@VeryImportant
public class AnCat {

    @ImportantString
    String name;
    int age;

    public AnCat(String name){
        this.name = name;
    }

    @RunImmediately(times = 3)
    public void sound(){
        System.out.println("Cat says meow.");
    }

    public void action(){
        System.out.println("Cat eats fish.");
    }

}
