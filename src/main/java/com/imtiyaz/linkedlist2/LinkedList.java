package com.imtiyaz.linkedlist2;

public class LinkedList<T> {

    private Node<T> head;

    public void insertAtHead(T data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
        linkedList.insertAtHead(9);
        linkedList.insertAtHead(8);
        linkedList.insertAtHead(10);
        linkedList.insertAtHead(5);
        linkedList.insertAtHead(7);

        System.out.println(linkedList +" and size is "+linkedList.size());

        System.out.println("Delete head");
        linkedList.deleteHead();
        System.out.println(linkedList);
    }
}
