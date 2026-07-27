package static_non_static;

import java.util.Random;

public class TestPoints {
    //Rule #1 - instance methods can access anything (static or instance) in the class
    //Rule #2 - static methods can only access other static members

    public static void main(String[] args) {
        TestPoints test = new TestPoints();
        test.testPoints();
        test.finishTest();
        test.printResults();
    }

    public void testPoints() {
        Random rand = new Random();

        //create five points
        for (int i = 1; i <= 50; i++) {
            Point randomPoint = new Point(
                rand.nextInt(10), 
                rand.nextInt(10));

            System.out.println(randomPoint);

            int count = Point.getObjectCount();
            System.out.println("Count: " + count);
        }
    }

    public void finishTest() {
        //...
    }

    public void printResults() {
        //...
    }
}
