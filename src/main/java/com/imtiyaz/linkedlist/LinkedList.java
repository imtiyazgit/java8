package com.imtiyaz.linkedlist;

/**
 * Created by imtiyaz on 8/10/17.
 */
public class LinkedList {
    private Node head;


    public void insertAtHead(int data) {
        Node node = new Node(data);
        node.setNextNode(this.head);
        this.head = node;
    }

    public int length() {
        Node current = head;
        int length=0;
        while(current!=null) {
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    public Node findMiddle() {
        Node current = head;
        Node middle = head;
        int length=0;
        while(current != null) {
            length++;
            if(length%2 ==0) {
                middle = middle.getNextNode();
            }
            current = current.getNextNode();
        }
        return middle;
    }

    public Node findMiddle2() {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.getNextNode()!=null) {
            slow = slow.getNextNode();
            fast = fast.getNextNode().getNextNode();
        }
        return slow;
    }

    // {[2],[3],[4],[5],[6],[7],[8],[9],}
    public Node delete(int position) {
        int size = length();
        if(position>size || position < 1) {
            System.out.println("Invalid Position");
            return head;
        }

        Node previous = head;
        int length = 1;

        if(position==1){
            Node temp = head;
            head = head.getNextNode();
            return temp;
        }

        while(length < position-1){
            length++;
            previous = previous.getNextNode();
        }

        Node current = previous.getNextNode();
        Node next = current.getNextNode();
        previous.setNextNode(next);
        return current;
    }

    public void deleteHeadNode() {
        head = head.getNextNode();
    }

    public Node find(int data) {
        Node current = head;
        while(current != null) {
            if(current.getData() ==  data) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = head;
        while(current != null) {
            result += current + ",";
            current = current.getNextNode();
        }

        result += "}";
        return result;
    }
}
