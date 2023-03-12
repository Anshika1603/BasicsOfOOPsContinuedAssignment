package com.knoldus.Question2;

public class PrintMethodOverloading {

    public void print(int Number)
    {
        System.out.println("Integer is: "+Number);
    }
    public void print(String Sentence)
    {
        System.out.println("String is: "+Sentence);
    }

    public static void main(String[] args) {
    PrintMethodOverloading printMethod=new PrintMethodOverloading();
    printMethod.print(10);
    printMethod.print("Hi There!");
    }
}
