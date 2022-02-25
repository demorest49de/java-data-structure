package Abstractions;

public interface Specie {
    String name = "name";
    int age = 15;
    boolean hasClaws = false;
    void Jump();
    default void yourAge(){
        System.out.println("yourAge ");
    }
}
