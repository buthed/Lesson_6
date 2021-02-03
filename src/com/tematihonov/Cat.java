package com.tematihonov;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public void run(int distance){
        if (distance>200) System.out.println(name + " не может пробежать " + distance + " м.");
        else System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swimming(int distance){
        System.out.println("Коты не умеет плавать");
    }

}
