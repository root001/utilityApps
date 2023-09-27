# utilityApps
Utility Apps
# Static Vs Non-static
Non-static applies to indivdual insatnces of an object but not the object itself

e.g Cat myCat = new Cat();
myCat.makesSound();

Static applies to methods, variables which are valid for the class.

e.g public class Cat(){
    public static int count = 0;

    public Cat(){
        count++;
    }

    public static int getCount(){
        return count;
    }
}

Cat.getCount();

KeypromoterX  - an intellij plugin for shortcuts