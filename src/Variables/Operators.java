package Variables;

public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2; //3
        result = result  +1; //4
        result = result %3 ; //1

        //result = result + 1; rather than this if we say result++ will be equal to result = result+1

        result++; // 1 + 1 = 2
        System.out.println(result);

        int deneme = 90;
        deneme++;
        System.out.println(deneme); //91

        deneme+= 10;
        System.out.println(deneme); //101

        result --; //2-1
        System.out.println(result); //1

        result+=2; //1+2 =3 // when we that result will be addition to 2
        System.out.println("1 + 2 = "+result); //3

        //result +result *  10
        result *= 10; // 3*10 =30            this mean result will be multipled with 10

        System.out.println("10 * 3 = "+result); //30

        result/=3;
        System.out.println(result); //10

        result-= 2;
        System.out.println(result); //8













    }





}
