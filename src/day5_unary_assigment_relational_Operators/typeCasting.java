package day5_unary_assigment_relational_Operators;

public class typeCasting {
    public static void main(String[] args) {

        byte b;
        int i=81;
        double d = 323.142;
        float f = 72.38f;
        char c = 'A';

        c = (char)i;
        System.out.println("i = " + i + " c " + c);

        i = (int) d;
        System.out.println("d " + d + " i " + i);

        System.out.println(i = (int) f);
        System.out.println(b = (byte) d);
    }
}
