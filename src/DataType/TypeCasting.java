package DataType;

public class TypeCasting {
    public static void main(String[] args) {
        byte a = (byte) 330;
        byte b = (byte) 428;
        double c = 4.5;
        float d = 3.4f;                     // by default point value is in the form of double.
        int e = 345;
        long f = 2345566l;                 // by default non-decimal value is in the form of integer
        System.out.println(a + " " + b);
        System.out.println(c + "  " + d);
        char ch = 'a';
        System.out.println((int) ch);
        ch++;
        System.out.println(ch);
        float g = 1.1f;
        double h = g;
        System.out.println(h + " " + g);


    }
}
