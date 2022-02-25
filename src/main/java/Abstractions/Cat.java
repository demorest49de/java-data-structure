package Abstractions;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public void Jump() {
        System.out.println("jump");
    }
}
