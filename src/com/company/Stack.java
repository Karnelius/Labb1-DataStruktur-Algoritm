package com.company;

    public class Stack extends LinkedList {


        public void push(int i) {
            LinkedList.Node newNode = new com.company.LinkedList.Node(i);
            newNode.next = head;
            head = newNode;
        }


        public int pop() {
            int x = get(0);
            remove(x);
            return x;
        }


        public int peek(int i) {
            com.company.LinkedList.Node current = head;
            int count = 0;
            while (current != null) {
                if (count == i)
                    return current.value;
                count++;
                current = current.next;
            }
            return 0;
        }
    }


