package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print(iterFact(5));
        System.out.print(recFact(5));

    }

    //the iterative method
    public static int iterFact(int num)
    {


        if(num==0){

            return 1;
        }
        int factorial=1;
        for (int i=1;i<=num;i++){

            factorial=factorial*i;
        }
        return  factorial;
    }

    //recursive method

    public static int recFact(int num)
    {

        if(num==0){
            return 1;
        }

        return num*recFact(num-1);
    }

}
