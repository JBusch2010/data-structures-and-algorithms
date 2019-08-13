package linked_list;
//https://www.geeksforgeeks.org/linked-list-set-1-introduction/

//the head of the list
public class LinkedList {
    public Node head;

    //link list node
    static class Node {
        int data;
        Node next;

        Node (int d) {
            data = d;
            next = null;
        }
    }

    public boolean includes(int data) {
        Node n  = head;
        while (n != null) {
            if (n.data == data) {
                System.out.println(n.data + " true");
                return true;


            }
            n = n.next;
        }
        System.out.println("false");
        return false;
    }

    //method for the simple linked list
    public static void main(String[] args) {
        //starts with empty linkedlist
        LinkedList list = new LinkedList();

        //Fabion helped me with this part and structuring it properly
        for(int i = 0; i < 3; i++) {
            list.insert(i);
            System.out.println(list.head.data);
        }

        list.includes(0);
        list.append(11);
        list.insertBefore(0, 4);
        list.insertAfter(0, 5);
//        list.toString();

    }

    public void insert(int value) {
        Node node = new Node(value);
        node.next = this.head;
        this.head = node;
    }
//    public String toString() {
//        String result = "HEAD";
//        Node current = this.head;
//        while (current != null) {
//            result = result + current.next;
//        }
//        result = result + "null";
//        System.out.println(result);
//        return result;
//    }

    //https://stackoverflow.com/questions/5236486/adding-items-to-end-of-linked-list
    //https://www.javatpoint.com/java-program-to-insert-a-new-node-at-the-end-of-the-singly-linked-list
    public void append(int data) {
        Node current = head;
        Node newNode = new Node(data);

        if (current == null) {
            head = newNode;
            return;
        }
        //looping until null is found
        while(current != null) {
            if (current.next == null) {
                // creates new node
                current.next = newNode;
                return;
            }
            current = current.next;
            System.out.println(newNode.data);
        }
    }

    public void insertBefore(int data, int newData) {
        Node current = head;
        Node newNode = new Node(newData);

        //looping until null is found
        if (current == null) {
            head = newNode;
            return;
        }

        if (current.data == data) {
            insert(newData);
            return;
        }

        //while node isn't null create new node before selected node/data
        while(current != null) {
            if (current.next.data == data) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }

            current = current.next;
            System.out.println(newNode.data);
        }
    }

    public void insertAfter(int data, int newData) {
        Node current = head;
        Node newNode = new Node(newData);

        //looping until null is found
        if (current == null) {
            head = newNode;
            return;
        }

        //while node isn't null create new node after selected node/data
        while(current != null) {
            if (current.data == data) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }

            current = current.next;
            System.out.println(newNode.data);
        }
    }
}


