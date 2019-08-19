package stacksandqueues;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Stack {
    public static Node top;

    public Stack () {
        this.top = null;
    }
    //turns the stack into a string
    public String toString () {
        Node temp = top;
        String returnString = "TOP";
        while (temp != null) {
            returnString += " -> " + (temp.data);
            temp = temp.next;
        }
        if (returnString.isEmpty()) {
            returnString += " -> NULL";
        }
        return returnString + " -> NULL";
    }

    //adds new node to stack
    public static void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public static int pop () {
        Node current = top;
        top = current.next;
        return current.data;
    }

    public static int peek() {
        return top.data;
    }
}