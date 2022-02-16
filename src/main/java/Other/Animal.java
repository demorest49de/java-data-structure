package Other;

public class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object object){
Animal otherAnimal = (Animal) object;
//        return  this.id == ((Other.Animal)object).id;
        return  this.id == otherAnimal.id;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Other.Animal animal = (Other.Animal) o;
//        return id == animal.id;
//    }
}
