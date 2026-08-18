package lists;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Numbers {
    public static void main(String[] args) {
        /*
            You must use wrapper types for primitives as the generic type
            for a data structure:

            int -> Integer
            double -> Double
            char -> Character
         */
        ArrayList<Double> nums = new ArrayList<Double>();

        LocalDateTime before = LocalDateTime.now();
        System.out.println(before);

        for (int i = 1; i <= 1_000_000; i++) {
            nums.add(Math.random());
        }

        if (nums.contains(0.0)) {
            System.out.println("Found zero");
        } else {
            System.out.println("Didn't find zero");
        }

        LocalDateTime after = LocalDateTime.now();
        System.out.println(after);
    }
}
