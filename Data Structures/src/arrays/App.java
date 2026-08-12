package arrays;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numsArray = new int[3];

        System.out.println(Arrays.toString(numsArray));

        numsArray[0] = 99;
        numsArray[1] = 42;
        numsArray[2] = 13;

        System.out.println(Arrays.toString(numsArray));

        //clear the array back to all zeroes?
        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = 0;
        }
        
        System.out.println(Arrays.toString(numsArray));
    }
}
