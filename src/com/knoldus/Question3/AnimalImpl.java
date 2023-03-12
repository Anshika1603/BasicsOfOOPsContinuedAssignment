package com.knoldus.Question3;
class Animal {
    public void print() {
        System.out.println("This is Animal Class");
    }
}
class Dog extends Animal {
    @Override
    public void print(){
        System.out.println("This is Dog Class");
    }
}

class Cat extends Animal {
    @Override
    public void print(){
        System.out.println("This is Cat Class");
    }
}

public class AnimalImpl {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.print();

        Dog dog=new Dog();
        dog.print();

        Cat cat=new Cat();
        cat.print();


    }
}
