package com.wipro.java.microservices;


interface Animal {
    void makeSound();  
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  
    }
}