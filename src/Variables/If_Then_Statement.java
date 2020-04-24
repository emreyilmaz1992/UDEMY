package Variables;

public class If_Then_Statement {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an Alien!"); // It is not an Alien!

        /* when you do if statement you don need put semi colon ; it's expanding to another line.
        if we put semi colon after column 6, column 7 will be independet and executed no matter what.
         */

        boolean isAlien2 = false;
        if (isAlien2 == false) {
            System.out.println("It is not an Alien!");
            System.out.println("I am scared of Allien");
            //It is not an Alien!
            //I am scared of Allien

        }  // We use curly bracket for to put multiple statements.

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }


        int secondTopScore = 60; //&& means 'and' , '&'
        if ((topScore > secondTopScore) && (topScore<100)){
            System.out.println("Greater than second top score and less then 100");
            // here we put 2 conditions. if the secondTopScore value was bigger than 80, then we wouldn't have gotten the result.
        }


        if ((topScore > 90) || (secondTopScore<= 90)){
            System.out.println("Either or both the conditions are true");
            /* "Either or both the conditions are true" --> this is the result. '||' means 'or' which we'll get the resul if the
            one of the given conditions is true. In this "case topScore > 90" is false. However, "secondTopScore <= 90" is true.
             */
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");


        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){ // (!isCar) means "isCar" is not equal to true. // we could use (isCar==false) too.
            System.out.println("This is not supposed to happen");
        }




        int deneme = 100;
        int deneme2 = 60;
        if (deneme >=150 || deneme2 <50)
            System.out.println("Yazdir biseyler"); //nothing will be executed.
















    }
}
