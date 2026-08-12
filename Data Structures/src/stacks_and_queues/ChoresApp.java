package stacks_and_queues;

import java.util.Arrays;
import java.util.Stack;

public class ChoresApp {
    public static void main(String[] args) {
        Stack<String> choresStack = new Stack<String>();

        choresStack.push("dusting");
        choresStack.push("cat litter");
        choresStack.push("dishes");
        choresStack.push("garbage");
        choresStack.push("laundry");

        System.out.println("All chores - " + choresStack);

        //look at my next task
        //String nextChore = choresStack.peek();

        //finished a few chores
        String finishedChore = choresStack.pop(); //remove the item from the stack
        System.out.println("Finished " + finishedChore);

        finishedChore = choresStack.pop();
        System.out.println("Finished - " + finishedChore);

        System.out.println("Still remaining chores - " + choresStack);

        //adds a few more chores
        choresStack.push("babyproof cabinets");
        choresStack.push("make bed");

        System.out.println("Still remaining chores - " + choresStack);

        //do one more chore
        finishedChore = choresStack.pop();
        System.out.println("Finished - " + finishedChore);

        System.out.println("Chores left: " + choresStack.size());

        //I'm lazy, no more chores!
        choresStack.clear();
        System.out.println("Still remaining chores - " + choresStack);
        System.out.println("Chores left: " + choresStack.size());
    }
}
