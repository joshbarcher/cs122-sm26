package static_non_static;

public class MonsterProgram {
    public static void main(String[] args) {
        Godzilla godzilla = new Godzilla("Reptile", true); 
        Godzilla mechaGodzilla = new Godzilla("Mech", true);
        Godzilla nuclearGodzilla = new Godzilla("Nuclear", false);

        //we call static methods on the class, not the object
        Godzilla.setOrigin("Mutated sea creature");
        Godzilla.setOrigin("Manufactured creature");

        System.out.println(godzilla.getType());

        godzilla.stomp();

        System.out.println(godzilla);
        System.out.println(mechaGodzilla);
    }
}
