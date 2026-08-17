package stacks_and_queues;

import java.util.LinkedList;
import java.util.Queue;

public class StudyApp {
    public static void main(String[] args) {
        //programming "against" the interface
        Queue<String> studyQueue = new LinkedList<String>();

        studyQueue.add("Check Canvas");
        studyQueue.add("Check announcements");
        studyQueue.add("Read week #6 reading");
        studyQueue.add("Work on takehome #3");
        studyQueue.add("Look at final study guide");
        studyQueue.add("Take final");

        //print out the next thing to study
        String todo = studyQueue.peek();
        System.out.println("Gauging what to do next: " + todo);

        //can you convert this to a while loop so that it removes + prints all todos?
        while (studyQueue.size() > 0) {
            todo = studyQueue.remove();
            System.out.println("Next up: " + todo);
        }

        System.out.println(studyQueue);
    }
}
