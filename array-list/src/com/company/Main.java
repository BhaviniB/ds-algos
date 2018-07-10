package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Jughead","Jones",22));
        employeeList.add(new Employee("Betty","Cooper",22));
        employeeList.add(new Employee("Veronica","Lodge",22));
        employeeList.add(new Employee("Archie","Andrews",22));
        employeeList.forEach(employee -> System.out.println(employee));//lambda expr
        System.out.println(employeeList.get(1)); //const time


        System.out.print(employeeList.isEmpty());
        employeeList.set(1,new Employee("Hiram","Lodge",2));
        employeeList.forEach(employee -> System.out.println(employee));//lambda expr

        System.out.println(employeeList.size());
        







    }
}
