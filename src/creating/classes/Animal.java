package creating.classes;

public class Animal {

    public void makeSound(){
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("meow");
    }
}
//////everthing is same except for body
    class Dog extends Animal{
        public void makeSound() {
            System.out.println("wof");
        }
}
class AnimalTest{
    public static void main (String [] args){
        Animal animal = new Animal() ;
        Animal cat = new Cat();
        Animal dog = new Dog();
        animal.makeSound();
        cat.makeSound();
    }

}