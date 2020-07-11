package Recaps.Inheritence;

public class Employee {
    public  double salary;
    public String name;
    public long ID;
    public String jobTitle;
    public char gender;

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                '}';
    }
}



