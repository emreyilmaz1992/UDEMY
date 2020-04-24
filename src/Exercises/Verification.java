package Exercises;

import java.util.Scanner;

public class Verification {
    public static void main(String[] args) {

        String bestFriend = "atakan";
        String petName    = "shorty";
        String lovelyWife   = "natasha" ;

        Scanner securityInput = new Scanner(System.in);
        System.out.println(" Please enter your best friend's name!");

        if(securityInput.hasNext(bestFriend)){
            bestFriend = securityInput.next();
            System.out.println("Please enter your pet's name!");
            if(securityInput.hasNext(petName)){
                petName = securityInput.next();
                System.out.println("Please enter your beautiful wife's name!");
                if(securityInput.hasNext(lovelyWife)){
                    lovelyWife = securityInput.next();
                    System.out.println("Thank you! Your password is'Emre1816");
                }else{
                    System.out.println("Don't you know your wife's name motherfucker!!!");
                }

            }else{
                System.out.println("Sorry, we are unable to verify your password!");
            }

        }else{
            System.out.println("Sorry, we are unable to verify your password!");
        }











    }
}
