package Exercises;

import java.util.Scanner;

public class NestedIF_exercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the current time");

        double time = input.nextDouble();
        String result = "";

        if(time >= 0 && time <= 24){
            result = (time >=7 && time <= 12)? "Good Morning": (time >12 && time <= 18)? "Good Afternoon":
                    (time >18 && time <= 22)? "Good Evening":"Good Night";
        }else {
           result = "Please enter a valid time";
        }
        System.out.println(result);



    }
}
