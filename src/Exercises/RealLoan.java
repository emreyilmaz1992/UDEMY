package Exercises;

import java.util.Scanner;

public class RealLoan {
    public static void main(String[] args) {

        int creditScore  ;
        int creditHistory;
        int salary       ;
        int hardInquires ;
        String str ;


        Scanner loanInput = new Scanner(System.in);

        System.out.println("Please enter your current credit score.");


        creditScore =loanInput.nextInt();
        if(loanInput.hasNextInt() == true){
            if(creditScore >= 600)

            System.out.println("How many years you've had your credit score for");



        }else{
            System.out.println("Wrong information");

        }
























    }
}
