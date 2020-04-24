package Variables;

public class StringLearning {
    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString is equal to "+ myString);

        myString = myString + ", and this is more";
        System.out.println("myString is equal to "+myString);

        myString = myString + " \u00A9 2019";

        System.out.println("myString is equal to "+myString);

        String LastString = "10";
        int myInt = 50;
        LastString = LastString + myInt;

        System.out.println("LastString is equal to "+LastString);

        double doubleNumber = 120.47d;
        LastString = LastString+doubleNumber;

        System.out.println("LastString is equal to "+LastString);




    }
}
