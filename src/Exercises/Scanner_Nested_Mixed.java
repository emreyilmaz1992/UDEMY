package Exercises;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Scanner_Nested_Mixed {

    public static void main(String[] args) {

        //Write a code for loan request that checks credit score(>=600), credit history(>=3), salary(>=70000), and hard inquires(<=3).


        int creditScore =700;
        boolean validScore = (creditScore >= 600);

        int creditHistory = 3;
        boolean validHistory = (creditHistory >= 3);

        int salary = 75000;
        boolean validSalary = (salary >= 70000);

        int hardInguires = 4;
        boolean validInquires = (hardInguires <=3);


        Scanner loanInput = new Scanner(System.in);
        System.out.println("Please enter your current credit score.");


        if(validScore){
            validScore = loanInput.hasNextBoolean();
            if(validScore){
                validScore = loanInput.hasNextBoolean();
                System.out.println("How many years you've had your credit score for?");
                if(validHistory){
                    validHistory = loanInput.hasNextBoolean();
                    System.out.println("What is your current salary?");
                    if(validInquires){
                        validInquires = loanInput.hasNextBoolean();
                        System.out.println("Congratulations! You've approved for a loan!");

                    }else {
                        System.out.println("Sorry, but we can't approve any loan with more than 4 hard inquires!");
                    }
                }else{
                    System.out.println("Sorry, but we can't approve any loan with less than 70000$!");
                }
            }else{
                System.out.println("Sorry, but we can't approve any loan with less than 3 year credit history!");
            }
        }else{
            System.out.println("Sorry, but we can't approve any loan with credit score lower than 600!");
        }





















    }
}
