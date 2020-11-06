package com.company;

public class LinkedList {
    protected Node head;

    class Node {

        protected int value;
        protected Node next;

        public Node(int v) {
            this.value = v;
        }
    }


    public int size() {
        if (head == null) {
            return 0;
        } else {
            int i = 1;
            Node n = head;
            while (n.next != null) {
                n = n.next;
                i++;
            }
            return i;
        }
    }


    public int get(int index) {
        int i = 0;
        Node n = head;
        while (i < index) {
            n = n.next;
            i++;
        }
        return n.value;
    }

    public void add(int e) {
        if (head == null) {
            head = new Node(e);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node(e);
        }
    }

    public void add(int index, int e) {
        Node newNode = new Node(e);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else if (head == null) {
            head = newNode;
        } else if (head.next == null) {
            newNode.next = head;
            head = newNode;
        } else {
            int i = 0;
            Node n = head;
            while (i < index - 1) {
                n = n.next;
                i++;
            }
            newNode.next = n.next;
            n.next = newNode;
        }
    }

    public void remove(int index) {
        Node temp = head, prev = null;
        if (temp != null && temp.value == index) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.value != index) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
    }


    public boolean contains(int e) {
        Node currNode = head;
        boolean dataFound = false;
        while (currNode != null) {
            if (currNode.value != e) {
                currNode = currNode.next;
                dataFound = false;
            } else if (currNode.value == e) {
                dataFound = true;
                break;
            }
        }
        return dataFound;
    }


    public boolean empty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
}
/* ToDO - En metod för att skriva ut hela listan.

    public void printList(com.company.LinkedList list) {
        Node currNode = list.head;

        System.out.println("LinkedList: ");

        while (currNode != null) {
            System.out.println(currNode.value + " ");
            currNode = currNode.next;
        }
    }
*/
