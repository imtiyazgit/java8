package com.imtiyaz.linkedlist2;

public class LinkedList<T> {

    private Node<T> head;

    public void insertAtHead(T data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
        linkedList.insertAtHead(1);
        System.out.println(linkedList);
    }
}
