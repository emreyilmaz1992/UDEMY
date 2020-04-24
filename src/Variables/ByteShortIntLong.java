package Variables;

public class ByteShortIntLong {
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer min Value =" +myMinIntValue);
        System.out.println("Integer max Value =" +myMaxValue);
        System.out.println("Busted Maxx Value = "+ (myMaxValue+1));  //this called overflow -2147483648
        System.out.println("Busted Min Value = "+ (myMinIntValue-1)); // -2147483648 underflow

        int myMaxInTest = 2_147_483_647; // we can also type it by using underscore-itd available for version Java7 or higher.


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Minumum Value in Byte = "+myMinByteValue);
        System.out.println("My Maximum Value in Byte = "+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Minumum Value in Short = "+myMinShortValue);
        System.out.println("My Maximum Value in Short = "+myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My Minumum Value in Long = "+myMinLongValue);
        System.out.println("My Maximum Value in Long = "+myMaxLongValue);

        int myTotal = (myMinIntValue/2); // we dont get any error
        byte myNewByteValue = (byte)(myMinByteValue / 2); //First we got an error  for (myMinByteValue / 2) cuz compiler took the data as an int.//
                                                    //We solved the problem by adding (byte) which called 'CASTING'//
        short myNewShortValue = (short)(myMinShortValue / 2);


        //===============    CHALLENGE ==================//
        byte b1 = 10;
        short s1 = 20;
        int i1 = 50;

        long l1 = 50000+(10*(b1+s1+i1));
        System.out.println(l1); //50800

        short shortTotal = (short)(1000+10* (b1+s1+i1));
        System.out.println(shortTotal);







    }
}
