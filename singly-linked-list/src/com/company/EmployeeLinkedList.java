package com.company;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;
    public void addToFront(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        node.setNext(head);
        head=node;
        size++;
    }
    public int getSize()
    {
        return size;
    }
    public boolean isEmpty(){
        if (head == null)
        {return true;
    }
    return false;}

    public void printList(){


        EmployeeNode current=head;
        System.out.println("Head->");
        while (current!=null){
            System.out.println(current);
            System.out.println("->");
            current=current.getNext();

        }
        System.out.println("null");

    }
}
