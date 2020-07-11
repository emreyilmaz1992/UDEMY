package Recaps.Inheritence;

public class Tester extends Employee{


        public Tester(double salary, String name,  long ID, String jobTitle, char gender){
            this.salary =salary;
            this.name = name;
            this.ID = ID;
            this.jobTitle = jobTitle;
            this.gender = gender;
        }

        public void reportingBug(){

            System.out.println(name+" is reporting a bug");

        }

        public void testing(){
            this.name = name;
            System.out.println(name+" is reporting a bug");
        }


}
