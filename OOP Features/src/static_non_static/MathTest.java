package static_non_static;

public class MathTest {
    public static void main(String[] args) {
        //MathHelpers helpers = new MathHelpers();

        double result = MathHelpers.add(10, 13.2);
        System.out.println(result);

        result = MathHelpers.mult(10, 13.2);
        System.out.println(result);
    }
}
