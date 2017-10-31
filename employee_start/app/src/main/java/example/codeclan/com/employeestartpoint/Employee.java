package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 28/08/2017.
 */

public class Employee {
    public int id;
    public String name;
    public String socialSecurityNumber;
    public double salary;

    private Employee(int id, String name, String socialSecurityNumber, double salary) {
        this.id = id;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }


    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


}
