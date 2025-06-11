package GU_OOPs;

public class 01Constrructor {
    Superclass() {
        
        System.out.println("Superclass constrructor");
    }
}

public class Subclass extends Superclass {
    subclass() {
        // implicit call to superclass consstructor
        System.out.println("Subclass constructor");
    }
}