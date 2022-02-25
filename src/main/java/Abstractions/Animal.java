package Abstractions;

public abstract class Animal implements Specie {



    public void  eat(){
        System.out.println("I am eating");
    }

    public static void see(){
        String myName = Specie.name;

        System.out.println("I see you " + Specie.name);
    }

    public abstract void makeSound();
}
