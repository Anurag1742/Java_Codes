package GU_OOPs;

// First interface
interface Animal {
    void sound();
}

// Second interface
interface Bird {
    void fly();
}

// Class implementing both interfaces
class Bat implements Animal, Bird {
    // Implementing sound() from Animal
    public void sound() {
        System.out.println("Bat makes screeching sound");
    }

    // Implementing fly() from Bird
    public void fly() {
        System.out.println("Bat can fly");
    }
}

// Main class to test
public class J15Inheritances {
    public static void main(String[] args) {
        Bat b = new Bat();
        b.sound();
        b.fly();
    }
}
