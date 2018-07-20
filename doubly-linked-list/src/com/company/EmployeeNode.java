package com.company;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public EmployeeNode getPrevious() {

        return previous;
    }

    public EmployeeNode(Employee employee)
    //only takes employee cause when we create an instance we do not know what the next node will be
    {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();

    }

}
