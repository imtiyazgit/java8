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

    public int findMiddle() {
        Node current = head;
        int j=0;
        for(int i=0; current != null; i++) {
            if(i%2==0) {
                j++;
            }
            current = current.getNextNode();
        }
        return j;
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
