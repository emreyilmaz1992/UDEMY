package Recaps.Inheritence;

public class Developer extends Employee {

    public Developer(double salary, String name, long ID, String jobTitle, char gender){
        this.salary = salary;
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.gender = gender;

    }

    public void fixingBug(){
        System.out.println(name+" is fixing bugs");
    }

}
