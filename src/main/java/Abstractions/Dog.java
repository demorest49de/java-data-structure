package Abstractions;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("wof!");
    }

    @Override
    public void Jump() {
        System.out.println("jump");
    }
}
