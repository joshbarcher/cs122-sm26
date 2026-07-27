package static_non_static;

public class Point {
    private double x, y;
    private static int objectCount = 0; //shared for all points!

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

        //access static fields in instance method
        objectCount++;
    }

    public double getX() { 
        return x; 
    }

    public double getY() { 
        return y; 
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public String toString() {
        return "(" + x + ", " + y + 
               ") - object #" + objectCount;
    }
}
