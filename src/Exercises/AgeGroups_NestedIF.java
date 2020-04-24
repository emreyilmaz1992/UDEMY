package Exercises;

import java.util.Scanner;

public class AgeGroups_NestedIF {
    public static void main(String[] args) {

        int age = 27;
        String ageGroup = "";

        if(age >=0 && age <150){
            if(age <21){
                ageGroup = "Teenager";
            }else if(age >= 21 && age <55){
                ageGroup = "Adult";
            }else{
                ageGroup = "Senior";
            }
        }else{
            ageGroup = "Invalid entry";
        }
        System.out.println("You are a "+ageGroup);

        System.out.println("=============================================");

        String ageGroup2 = "";

        if(age>= 0 && age <150){
           ageGroup2 = (age < 21)? "Teenager" : (age >= 21 && age < 55)? "Adult": "Senior";
        }else {
            ageGroup2= "Invalid";
        }
        System.out.println(ageGroup2);


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score");
        int score =input.nextInt();
        char grade = 'A';

        if(score >= 0 && score <= 100){
            grade = (score >= 90 )? 'A': (score >= 80)? 'B':(score >= 70)? 'C': (score >= 60)? 'D':'F';
        }else{
            grade = 'X';
        } System.out.println(grade);

        String grade2 = "";

        if(score>= 0 && score<= 100){
            if(score >= 90){
                grade2 = "A";
            }else if (score >= 80){
                grade2 = "B";
            }else if(score >= 70){
                grade2 = "C";
            }else {
                grade2 = "F";
            }






        }else{
          grade2 = "Invalid";
        }
        System.out.println(grade2);












    }
}
