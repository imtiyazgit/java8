package com.imtiyaz.linkedlist;

/**
 * Created by imtiyaz on 8/10/17.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtHead(9);
        linkedList.insertAtHead(8);
        linkedList.insertAtHead(7);
        linkedList.insertAtHead(6);
        linkedList.insertAtHead(5);
        linkedList.insertAtHead(4);
        linkedList.insertAtHead(3);
        linkedList.insertAtHead(2);
        linkedList.insertAtHead(1);

        System.out.println("Middle" + linkedList.findMiddle2());
        System.out.println(linkedList);

        System.out.println("Found" + linkedList.find(2));

        linkedList.deleteHeadNode();

        System.out.println(linkedList);

        System.out.println(linkedList.length());


        System.out.println(linkedList);
        System.out.println("Deleting - "+linkedList.delete(10));
        System.out.println(linkedList);


    }
}
