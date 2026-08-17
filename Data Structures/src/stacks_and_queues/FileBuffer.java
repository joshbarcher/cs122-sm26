package stacks_and_queues;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FileBuffer {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("output.txt")) {
            String[] contents = {
                "Pets: Beer",
                "Pets: Lazarus",
                "Pets: Ginny",
                "Pets: Mochi",
                "Pets: Mocha",
                "Pets: Lynxie",
                "Pets: Dipper",
                "Pets: Chuchu",
                "Pets: Tiger"
            };

            //example of buffering
            Queue<String> buffer = new LinkedList<String>();
            int max = 7;

            for (int i = 0; i < contents.length; i++) {
                String content = contents[i];
                buffer.add(content);

                //ask whether we should "flush" the buffer
                if (buffer.size() == max) {
                    System.out.println("Flushing the buffer");
                    flush(writer, buffer);
                }
            }

            //flush all remaining content to file!
            if (!buffer.isEmpty()) {
                System.out.println("Flushing the remaining elements in the buffer");
                flush(writer, buffer);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error writing to file: " + ex.getMessage());
        }
    }

    public static void flush(PrintWriter writer, Queue<String> buffer) {
        while (!buffer.isEmpty()) {
            String line = buffer.remove();
            writer.println(line);
            System.out.println("Writing to file: " + line);
        }
    }
}
