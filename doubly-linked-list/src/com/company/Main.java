package com.company;

public class Main {

    public static void main(String[] args) {
        Employee jameJones=new Employee("Jame","Jones",5555);
        Employee johnJones=new Employee("John","Jones",4454);
        Employee jugheadJones=new Employee("Jughead","Jones",5335);
        Employee fpJones=new Employee("FP","Jones",1155);
        EmployeeDoublyLinkedList l=new EmployeeDoublyLinkedList();
        l.addToFront(jameJones);
        l.addToFront(fpJones);
        l.addToFront(jugheadJones);
        l.addToFront(johnJones);
        Employee billEnd=new Employee("Bill","End",7777);
        l.addToEnd(billEnd);
        l.printList();
//        System.out.println(l.getSize());
       // System.out.println(l.isEmpty());

        //l.removeFromFront();
        //System.out.println(l.getSize());






        // write your code here
    }
}
