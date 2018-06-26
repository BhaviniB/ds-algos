package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int array[]={20,35,-15,7,55,1,-22};
    for(int lastUnsortedIndex=array.length-1;lastUnsortedIndex>0;lastUnsortedIndex--)
    {
        for (int i=0;i<lastUnsortedIndex;i++)
        {
            if(array[i]>array[i+1])

                swap(array,i,i+1);

        }
    }

        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }

    }



    public static void swap(int array[],int i,int j)
            //i and j are the two indices that we want to swap
    {
        if(i==j){

            return;
        }
        int temp;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }
}
