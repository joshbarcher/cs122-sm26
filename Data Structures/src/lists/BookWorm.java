package lists;

import java.util.ArrayList;
import java.util.Arrays;

public class BookWorm {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<String>();

        books.add("Dune: Messiah");
        books.add("Count Of Monte Cristo");
        books.add("Percy Jackson");
        books.add("Jane Eyre");
        books.add("The Grace Of Kings");
        books.add("The Lord Of The Rings");
        books.add("Red Rising");
        books.add("Anne Of Green Gables");
        books.add("Dresden Files");
        books.add("Captain Underpants");

        //remove by object - Object.equals()
        books.remove("The Grace Of Kings");

        //remove by index
        books.remove(1);

        //get by index
        String firstBook = books.get(0);

        //contains
        System.out.println("Found 'Red Rising'? " + books.contains("Red Rising"));
        System.out.println("Found 'Where Rainbows End'? " + books.contains("Where Rainbows End"));

        if (books.contains("Dresden Files")) {
            System.out.println("Cool!");
        }

        for (int i = 0; i < books.size(); i++) {
            String book = books.get(i);
            System.out.println("Book #" + (i + 1) + ": " + book);
        }
    }

    public static void booksWithArrays() {
        String[] books = new String[500];

        books[0] = "Dune: Messiah";
        books[1] = "Count Of Monte Cristo";
        books[2] = "Percy Jackson";
        books[3] = "Jane Eyre";
        books[4] = "The Grace Of Kings";
        books[5] = "The Lord Of The Rings";
        books[10] = "Red Rising";
        books[15] = "Anne Of Green Gables";

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println("Book #" + (i + 1) + ": " + books[i]);
            }
        }
    }
}
