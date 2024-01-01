package com.prasad.practice.homework;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Reverse_Linklist {
    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }
    Node reverse(Node node)
    {
        Node prev=null;
        Node curr=node;
        Node next=null;
        while (curr !=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node=prev;
        return node;
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        Reverse_Linklist list = new Reverse_Linklist();
        list.head = new Node(10);
        list.head.next = new Node(15);
        list.head.next.next = new Node(20);
        list.head.next.next.next = new Node(25);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}

