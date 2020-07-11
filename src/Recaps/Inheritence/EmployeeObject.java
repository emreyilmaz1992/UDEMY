package Recaps.Inheritence;

public class EmployeeObject {



    public static void main(String[] args) {

        Tester tester = new Tester(2000,"emre",293232,"SDET",'M');

        Developer developer = new Developer(2000,"Behcet",223131,"Developer",'N');

        System.out.println(tester);
        System.out.println(developer);


    }



}
