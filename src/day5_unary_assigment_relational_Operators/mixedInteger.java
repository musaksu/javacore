package day5_unary_assigment_relational_Operators;

public class mixedInteger {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 10;
        float f1 = 15.5f;
        double d1 = 20.5;

        int res1 = i1+i2;
        float res2 = i1 + f1;
        double res3 = i2 + d1;

        short firstNumber = 10;
        short secondNumber = 20;

        int thirdNumber = firstNumber + secondNumber;
        short thirdNumber2 = (short) (firstNumber + secondNumber);

//        byte b1 = 20;
//        byte b2 = 2;
//
//        byte b3 =(byte) (b1*b2); //Casting is required
//        int  b4 = b1*b2;

        int b1 = 20;
        int b2 = 30;

        byte res4 = (byte) (b1+b2);  //Casting is required

        byte res5 = 126 + 1;

        int b = 25;
        System.out.println(b++);
        System.out.println(b--);
        System.out.println(b);


    }
}
