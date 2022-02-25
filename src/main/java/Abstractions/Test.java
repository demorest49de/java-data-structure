package Abstractions;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animal = new Cat();
        animal.eat();
        animal.makeSound();
        Animal.see();

        Specie specie = new Dog();
        specie.Jump();
        specie.yourAge();

    }
}
