package com.imtiyaz.linkedlist;

/**
 * Created by imtiyaz on 8/10/17.
 */
public class LinkedList {
    private Node head;


    public void insertAtHead(int data) {
        Node node = new Node(data);
        node.setNextNode(head);
        head = node;
    }


    @Override
    public String toString() {
        String result = "{";
        Node current = head;
        while(current.getNextNode()!= null) {
            result += current + ",";
        }

        result += "}";
        return result;
    }
}
