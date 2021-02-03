package com.tematihonov;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void run(int distance){
        if (distance>500) System.out.println(name + " не может пробежать " + distance + " м.");
        else  System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swimming(int distance){
        if (distance>10) System.out.println(name + " не может проплыть " + distance + " м.");
        else System.out.println(name + " проплыл " + distance + " м.");

    }
}
