package com.tematihonov;

public class Main {

    public static void main(String[] args) {
    	int count;

		Cat cat = new Cat("Кузя");
		Cat cat1 = new Cat("Василий");
		Dog dog = new Dog("Баря");
		Dog dog1 = new Dog("Барбос");
		Dog dog2 = new Dog("Барбос");

		cat.run(200);
		cat.swimming(5);
		dog.run(400);
		dog.swimming(5);

		cat1.run(350);
		cat1.swimming(22);
		dog1.run(600);
		dog1.swimming(15);

    }
}
