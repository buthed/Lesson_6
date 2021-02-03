package com.tematihonov;

public class Animal {
    public String name;
    public int distance;

    public Animal(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swimming(){
        System.out.println(name + " проплыл " + distance + " м.");
    }
}
