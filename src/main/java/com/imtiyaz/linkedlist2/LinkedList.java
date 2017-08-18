package com.imtiyaz.linkedlist2;

public class LinkedList<T> {

    private Node<T> head;

    public Node insertAtHead(T data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public void deleteHead() {
        head = head.next;
    }

    public int size() {
        int length=0;
        Node current = head;
        while(current!=null) {
            length++;
            current = current.next;
        }
        return length;
    }


    //5 10 8 9 4 3 2
    public void reverseUsingIteration() {
        Node previous = null;
        Node current = head;
        Node next;
        while (current!=null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head=previous;
    }

    public Node reverseUsingRecursion() {
        head = reverseUsingRecursion(head);
        return head;
    }

    //2 3 4 9 8 10 5
    public Node reverseUsingRecursion(Node current) {
        if(current == null || current.next == null) {
            return current;
        }

        Node newHead = reverseUsingRecursion(current.next); // once newHead is set, just pass on to recursive methods of frames.. it doesnt change
        current.next.next = current;
        current.next = null;
        return newHead;
    }

    // No need to have this method. This method is created just for creating a loop.
    public void createLoopAtEnd(Node newNode) {
        Node current=head;
        Node lastNode = head;
        while(current != null) {
            lastNode = current;
            current = current.next;
        }

        lastNode.next = newNode;
    }

    //5 10 8 X 9 4 3 2
    public void insertAtPosition(int position, int data) {
        int length=1;
        Node current=head;
        while(length<position-1) {
            current = current.next;
            length++;
        }

        Node newNode = new Node(data);
        Node next = current.next;
        current.next = newNode;
        newNode.next = next;
    }

    // 1 2 3 4 5 2
    public boolean detectLoop() {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    private static class Node<T> {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    @Override
    public String toString() {
        Node current = head;
        while(current != null) {
            System.out.format("%d ", current.data);
            current = current.next;
        }
        return "";
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(3);
        linkedList.insertAtHead(4);
        Node node9 = linkedList.insertAtHead(9);
        linkedList.insertAtHead(8);
        linkedList.insertAtHead(10);
        linkedList.insertAtHead(5);
        linkedList.insertAtHead(7);

        System.out.println(linkedList + " and size is " + linkedList.size());

        System.out.println("Delete head");
        linkedList.deleteHead();
        System.out.println(linkedList);

        // reverse using iteration
        System.out.println("Reverse Using iteration");
        linkedList.reverseUsingIteration();
        System.out.println(linkedList);

        // reverse using recursion
        System.out.println("Reverse using recursion");
        linkedList.reverseUsingRecursion();
        System.out.println(linkedList);

        // insert at a specific position
        System.out.println("Inserting at 4 value 11");
        linkedList.insertAtPosition(4, 11);
        System.out.println(linkedList);

        // create a loop of 9 4 3 2 9
        System.out.println("Creating a loop at end 5 10 8 11 9 4 3 2 9");
        linkedList.createLoopAtEnd(node9);
        System.out.println("Is loop exists: " + linkedList.detectLoop());
        System.exit(1);
    }
}
