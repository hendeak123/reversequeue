package com.company;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        try {
            myQueue.add("One");
            myQueue.add("Two");
            myQueue.add("Three");
            myQueue.add("Four");
            myQueue.add("Five");
            myQueue.add("Six");
            myQueue.add("Seven");
            myQueue.add("Eight");
            myQueue.add("Nine");
            myQueue.add("Ten");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(myQueue);
            reverseQueue(myQueue);
        }
    }

    private static void reverseQueue(Queue<String> myQueue) {
        Stack<String> newStack = new Stack<String>();
        try {
            while (!myQueue.isEmpty()) {
                newStack.add(myQueue.peek());
                myQueue.remove();
            }
            while (!newStack.isEmpty()) {
                myQueue.add(newStack.peek());
                newStack.pop();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(myQueue);
        }
    }
}
