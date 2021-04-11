package examples;

public class Main {

    public static void main(String[] args) {

        // Create person class object
        // Person person = new Person();
        // First creates and object memory in heap with default values
        Person person = new Person("suraj", "more");
        // assigned or update the heap person object memory the default values with
        // given
        person.firstName = "Sandeep";
        person.lastName = "More";

        System.out.println(person.FullName());
        System.out.println(person.FullName());

        Person id = new Person("suraj", "more");
        System.out.println(id.FullName());

        System.out.println(Gender.Male);

        Person employee = new Employee();

        Employee e=(Employee)employee;
        //here we have accessed the data from the employee class through the object "e".
        
        e.firstName="sai";
        e.lastName="hambeere";
       


    

        // Employee e = (Employee)employee;

        System.out.println(e.Getgender());
        System.out.println(e.TotalYears());
        System.out.println(e.FullName());
        System.out.println(e.firstName);
        System.out.println(e.TotalYears());
        

        
        Person worker = new Woker();

        

    }
}
