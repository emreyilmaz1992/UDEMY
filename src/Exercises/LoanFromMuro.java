package Exercises;

import java.util.Scanner;
public class LoanFromMuro {



    public static void main(String[] args) {

        boolean validCurrentStatus;
        boolean validCitizenship;
        int validSalary;
        int validWorkExperience;




        Scanner loaninput = new Scanner(System.in);

        System.out.println("You are usa citizen ?");
        validCitizenship=loaninput.nextBoolean();
        if (validCitizenship==true){
            System.out.println("You are currently working ?");
            validCurrentStatus=loaninput.nextBoolean();
            if (validCurrentStatus ==true){
                System.out.println("How much is your current monthly salary?");
                validSalary=loaninput.nextInt();
                if (validSalary>=3000){
                    System.out.println("How many years you have experiences ?");
                    validWorkExperience=loaninput.nextInt();
                    if (validWorkExperience>=5){
                        System.out.println("Congragts!!\nYou have been approved for $50.000 loan!");
                    }else {
                        System.out.println("Sorry we are unable to approve your loan application at this time. \nPlease try again later.");
                    }
                }else{
                    System.out.println("Sorry we are unable to approve your loan application at this time. \nPlease try again later.");

                }
            }else{
                System.out.println("Sorry we are unable to approve your loan application at this time. \nPlease try again later.");

            }

        }else{
            System.out.println("Sorry we are unable to approve your loan application at this time. \nPlease try again later.");

        }


    }
}
