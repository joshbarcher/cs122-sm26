package lists;

public class Casting {
    public static void main(String[] args) {
        /* 
            Primitives:

            ** integers **
            byte - 8 bits (-128 -> 127, total of 2^8 = 256)
            short - 16 bits (~-32k -> ~32k, total of 2^16 = 64k)
            int - 32 bits (~-2b -> 2b, total of 2^32 = 4b)
            long - 64 bits (...)

            ** decimals (aka floating point numbers) **
            float
            double
            
            char
            boolean

            Rule: Computers store numbers as twos-complement numbers.
        */

        //widening conversion (smaller bits -> larger bits)
        byte myByte = 50;
        int myInt = myByte;

        //narrowing conversion (larger bits -> smaller bits)
        int myInt2 = 1000;
        byte myByte2 = (byte) myInt2;

        System.out.println("myByte2 = " + myByte2);

        /*
            0000 = 0
            0001 = 1
            0010 = 2
            0011
            0100
            0101
            0110
            0111 = 7
            1000 = -8
        
        */

        //upcasting
        String str1 = "Hello, world!";
        Object obj1 = str1;

        Object obj2 = new Book("Red Rising");

        //casting is downcasting
        String str2 = (String) obj2;

        System.out.println(obj1);
    }
}
