package com.knoldus.Question1;

public class MethodOverloading {
    public int add(int FirstNumber, int SecondNumber)
    {
        return FirstNumber+SecondNumber;
    }
    public int add(int FirstNumber, int SecondNumber, int ThirdNumber)
    {
        return FirstNumber+SecondNumber+ThirdNumber;
    }

    public static void main(String[] args) {
        MethodOverloading Addition=new MethodOverloading();
        int SumOfTwo=Addition.add(10,20);
        int SumOfThree=Addition.add(20,30,40);
        System.out.println(SumOfTwo);
        System.out.println(SumOfThree);
    }
}
