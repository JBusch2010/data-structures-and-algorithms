package stacksandqueues;

public class Queue {
    public static Node front;

    public Queue() {
        this.front = null;
    }

    public String toString () {
        Node temp = front;
        String returnString = "FRONT";
        while (temp != null) {
            returnString += " -> " + (temp.data);
            temp = temp.next;
        }
        if (returnString.isEmpty()) {
            returnString += " -> NULL";
        }
        return returnString + " -> NULL";
    }

    public static void enqueue(int data) {
        Node current = front;
        Node newNode = new Node(data);

        if (current == null) {
            front = newNode;
            return;
        }
        //looping until null is found
        while (current != null) {
            if (current.next == null) {
                // creates new node
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    public static int dequeue() {
        Node current = front;
        front = current.next;
        return current.data;
    }

    public static int peek() {
        return front.data;
    }
}
