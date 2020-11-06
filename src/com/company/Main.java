package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.size();
        list.add(0,99);
        list.size();
        list.get(0);
        list.get(3);
        list.remove(3);
        list.size();
        list.empty();


        //list.contains(1);

        Stack stack = new Stack();

        stack.push(50);
        stack.pop();
        stack.peek(0);
        stack.push(400);
        stack.pop();
        System.out.println("stack index 0: " + stack.peek(0));
        System.out.println("stack index 1: " + stack.peek(1));

    }
}
