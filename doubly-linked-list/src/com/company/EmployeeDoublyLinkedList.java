package com.company;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;

    private int size;
    public void addToFront(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        node.setNext(head);
//check if we are adding to an empty list
        if(head==null){

            tail=node;
        }else {
            head.setPrevious(node);
        }

        head=node;
        size++;
    }


    public void addToEnd(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
       if(tail==null){
           head.setNext(node);
       }
       else{

           tail.setNext(node);
           node.setPrevious(tail);
       }
       tail=node;
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
    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            System.out.println("nothinhg to remove");
            return null;
        }

        EmployeeNode removedNode= head;
        if(head.getNext()==null){

            tail=null;
        }
        else{

            head.getNext().setPrevious(null);

        }
        head=head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;

    }
    public EmployeeNode removeFromLast() {

       if (isEmpty()) {
            return null;
        }
        //if theres jus one in the list

        EmployeeNode removedNode= tail;


        if (tail.getNext()==null) {
           head=null;
        }

        else {

           tail.getPrevious().setNext(null);

        }
        tail=tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;

    }

    public void printList(){


        EmployeeNode current=head;
        System.out.println("Head->");
        while (current!=null){
            System.out.println(current);
            System.out.println("<->");
            current=current.getNext();

        }
        System.out.println("null");

    }
}
