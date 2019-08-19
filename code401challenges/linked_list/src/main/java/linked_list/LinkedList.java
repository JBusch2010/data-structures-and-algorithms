package linked_list;
//https://www.geeksforgeeks.org/linked-list-set-1-introduction/

//the head of the list
public class LinkedList {
    public static Node head;

    //link list node
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    //method for the simple linked list
    public void main(String[] args) {
        //starts with empty linkedlist
        LinkedList list = new LinkedList();

        //Fabion helped me with this part and structuring it properly
        for (int i = 0; i < 10; i++) {
            list.insert(i);
            System.out.println(list.head.data);
        }

//        list.includes(0);
//        list.append(1);
//        list.insertBefore(4, 2);
//        list.insertAfter(0, 5);
//        list.kNodeFromEnd(5);
//        list.toString();
    }

    public boolean includes(int data) {
        Node n = head;
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

    public static void insert (int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;  // new node becomes the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String toString() {
        Node temp = head;
        String returnString = "HEAD";
        while (temp != null) {
            returnString += " -> " + Integer.toString(temp.data);
            temp = temp.next;
        }
        if (returnString.isEmpty()) {
            returnString += " -> NULL";
        }
        return returnString + " -> NULL";
    }

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
        while (current != null) {
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
        while (current != null) {
            if (current.next.data == data) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }

            current = current.next;
//            System.out.println(newNode.data);
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
        while (current != null) {
            if (current.data == data) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }

            current = current.next;
//            System.out.println(newNode.data);
        }
    }

    //https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/
    public void kNodeFromEnd(int k) {
        int len = 0;
        Node temp = head;

        //count the number of nodes in the list
        while (temp != null) {
            temp = temp.next;
            len++;

        }
        //check if length of list is longer than k
        if (len < k)
            return;

        temp = head;

        for (int i = 1; i < len - k + 1; i++)
            temp = temp.next;
//        System.out.println(temp.data);
    }

    public LinkedList mergeLists(LinkedList list1, LinkedList list2) {

        LinkedList mergedList = new LinkedList();
        Node firstList = list1.head;
        Node secondList = list2.head;

        while(firstList != null || secondList != null) {
            if(firstList != null) {
                mergedList.insert(firstList.data);
                firstList = firstList.next;
                if(secondList != null) {
                    mergedList.insert(secondList.data);
                    secondList = secondList.next;
                }
            }
            else if(secondList != null) {
                mergedList.insert(secondList.data);
                secondList = secondList.next;
            }
        }
        return mergedList;
    }
}


