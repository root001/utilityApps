package javaTools.records;

public class RecordsTuts {

    public static void main(String [] args){
        Employees employees = new Employees("Traven", 212);
        System.out.println("Object : "+employees);
        System.out.println("Employee name : "+employees.getName());

        EmployeeRecord employeeRecord = new EmployeeRecord("Shola", 72);
        System.out.println("Object : "+employeeRecord);
        System.out.println("Employee name : "+employeeRecord.name());
        System.out.println("Upper name : "+employeeRecord.nameUpperCase());
        // calling static method in record
        EmployeeRecord.samplePrint();
    }
}
