package Variables;

public class Float_Double {
    public static void main(String[] args) {

        float myMintFloatValue= Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minumum value = "+myMintFloatValue);
        System.out.println("Float maximum vlaue = "+myMaxFloatValue);

        double myMintDoubleValue= Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minumum value = "+myMintDoubleValue);
        System.out.println("Double maximum vlaue = "+myMaxDoubleValue);


        int myIntValue = 5/3;
        //float myFloatValue = (float) 5.25; // or we can add 'f' at the end.
        float myFloatValue = 5f /3f;
        double myDoubleValue = 5d / 3d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double deneme = 5/3;
        System.out.println(deneme); // =1

        double deneme2 = 5.00/3.00;
        System.out.println(deneme2); // =1.6666666666666667 if you wanna get a pricise number add '.00'


        //================CHALLANGE========


        double Pound = 200;
        double Pound_to_KG = Pound * 0.45359237;
        System.out.println(Pound +(" pound is = "+Pound_to_KG+" kg."));

        double pi = 3.1415927;
        double anotherNumber = 3_000_000.4_567_890;
        System.out.println(pi);
        System.out.println(anotherNumber);











    }
}
