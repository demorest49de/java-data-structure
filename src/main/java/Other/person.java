package Other;

public class person {



    public String name;
    public int age;

    public person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void set(){
        System.out.println(this.age + this.name);
    }
}

