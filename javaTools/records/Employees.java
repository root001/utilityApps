package javaTools.records;

import java.util.Objects;

public class Employees {

    private final String name;
    private final int number;

    public Employees(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Employees{ name='" + name + '\'' + ", number=" + number + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    // overriding default equals method
    @Override
    public boolean equals(final Object o){
        if (this == o){
            return true;
        }

        if (o == this){
            return false;
        }
        if (getClass() != o.getClass()){
            return false;
        }

        Employees employees = (Employees) o;
        return Objects.equals(number, employees.number)&&Objects.equals(name, employees.name);
    }
}
