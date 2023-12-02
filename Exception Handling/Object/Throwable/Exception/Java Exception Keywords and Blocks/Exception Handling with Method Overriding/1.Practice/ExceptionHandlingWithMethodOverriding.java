class Parent {
    // Method in the superclass that declares an exception
    void exampleMethod() throws ParentException {
        System.out.println("Parent's exampleMethod");
    }
}

class Child extends Parent {
    // Overriding method in the subclass that throws a subclass of ParentException
    @Override
    void exampleMethod() throws ChildException {
        System.out.println("Child's exampleMethod");
        // Simulating an operation that might throw ChildException
        throw new ChildException("ChildException occurred");
    }
}

// Custom exception class for Parent
class ParentException extends Exception {
    public ParentException(String message) {
        super(message);
    }
}

// Custom exception class for Child (subclass of ParentException)
class ChildException extends ParentException {
    public ChildException(String message) {
        super(message);
    }
}

public class ExceptionHandlingWithMethodOverriding {
    public static void main(String[] args) {
        try {
            // Creating an instance of Child
            Parent parent = new Child();
            // Calling the overridden method, which might throw ChildException
            parent.exampleMethod();
        } catch (ParentException e) {
            // Handling the exception
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}
