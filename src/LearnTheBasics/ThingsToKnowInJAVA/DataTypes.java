package LearnTheBasics.ThingsToKnowInJAVA;





public class DataTypes {
    public static void main(String[] args) {
        int a = 12;

//      A 64-bit signed integer used when int is not sufficient for large values.
//      Size : 8 bytes (64 bits)
        long b = 23321;


//      An 8-bit signed integer used to save memory in large numeric arrays.
        byte val = 23;

//      A 16-bit signed integer often used when memory is limited and values are moderate in size.
        short students = 1000;
        short temp = -200;
        System.out.println("Students: " + students);
        System.out.println("Temperature: " + temp);


//       A 32-bit single-precision floating-point type used for fractional values
//       Size : 4 bytes (32 bits)
        float y = 4.3f;

//        A 64-bit double-precision floating-point type and the default for decimal numbers.Syntax:
//        Size : 8 bytes (64 bits).

        double z = 8.999;

//      A 16-bit Unicode character used to store single symbols or letters.
//      Size : 2 bytes (16 bits)

        char r = 'k';

        boolean t = true;
        boolean i = false;

        String str = "Hello";






    }
}
