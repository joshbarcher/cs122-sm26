import objects.Pencil;

/**
 * Common questions:
 * 
 * 1. What are the pillars of OOP?
 *    - Inheritance - reusing code (parent/child relationships, extends keyword)
 *    - Encapsulation (abstraction) - data hiding (private fields, getters/setters)
 *    - Polymorphism - variables have different forms (examples of this are overloading + overriding)
 * 
 * 2. Does every class have a constructor? YES!
 * 3. Does every class you create have a parent class? YES!
 * 4. What is the difference between using extends vs. implements in a class header? extends used with a parent class definition, implements with using an interface
 * 
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        Pencil pencil = new Pencil();
    }
}
