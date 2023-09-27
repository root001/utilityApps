package javaTools.records;

/**
 * Same as the Employees class created with the private, canonical constructor, getter, etc
 * Records are immutable by default hence no setter methods are created.
 * All record classes automatically inherit the record class hence cannot inherit other classes
 * e.g
 * public record EmployeeRecord(String name, int number) extends Organization would fail
 * But able to implement other classes
 * e.g
 * public record EmployeeRecord(String name, int number) implements Runnable
 */
public record EmployeeRecord(String name, int number) {

    public static final String DEFAULT_NAME = "Gregory";

    /**
     * The records class asides creating a canonical constructor by default, allows you create a compact constructor
     * to override the default constructor created.
     * @return
     */
    public EmployeeRecord{
        if(number < 0){
            throw new IllegalArgumentException("Employee number must be greater than zero");
        }
    }

    public String nameUpperCase(){
        return name.toUpperCase();
    }

    public static void samplePrint(){
        System.out.println("Printing out random text");
    }
}
