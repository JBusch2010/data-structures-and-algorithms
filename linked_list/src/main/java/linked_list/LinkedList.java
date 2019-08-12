package linked_list;
//https://www.geeksforgeeks.org/linked-list-set-1-introduction/

//the head of the list
public class LinkedList {
    Node head;

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
        for(int i = 0; i < 4; i++) {
            list.insert(i);
            System.out.println(list.head.data);
        }

        list.includes(5);
    }

    public void insert(int value) {
        Node node = new Node(value);
        node.next = this.head;
        this.head = node;
    }
}

