abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

class Duck extends Animal implements Swimmable, Flyable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi.");
    }

    @Override
    public void fly() {
        System.out.println(name + " đang bay.");
    }
}

class Fish extends Animal implements Swimmable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi.");
    }
}

public class gioi1 {
    public static void main(String[] args) {

        Duck duck = new Duck("Vịt Donald");
        Fish fish = new Fish("Cá Nemo");

        System.out.println("Duck");
        duck.swim();
        duck.fly();

        System.out.println("\nFish");
        fish.swim();
        // fish.fly(); //lỗi vì Fish không có fly()
    }
}