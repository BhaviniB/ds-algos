package com.company;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

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
        //adding and default shifting

        employeeList.add(3,new Employee("Fred","Andrews",44));
        employeeList.forEach(employee -> System.out.println(employee));//lambda expr
        Employee [] employeeArray=employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee:employeeArray){
            System.out.print(employee);
        }
        System.out.println(employeeList.contains(new Employee("Archie","Andrews",22)));//false
        //eventho they are structurallty the same, it is a new instatnce thats been created but if we override euqlas() then it ll give true
        System.out.println(employeeList.indexOf(new Employee("Archie","Andrews",22)));//4
        










    }
}
