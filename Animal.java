public class Animal {
    public static void eat(){
        System.out.println("Eating");
    }
    public static void sleep(){
        System.out.println("Sleeping");
    }
}
class Cat extends Animal{
    public static void meow(){
        System.out.println("Meow");
    }
}
class Dog extends Animal {
    public static void bark(){
        System.out.println("Barking");
    }
}
class Main {
    public static void main (String[] args){
        Cat c = new Cat();
        Dog d = new Dog();
        Animal a = new Animal();
        c.sleep();
        d.eat();
    }
}

