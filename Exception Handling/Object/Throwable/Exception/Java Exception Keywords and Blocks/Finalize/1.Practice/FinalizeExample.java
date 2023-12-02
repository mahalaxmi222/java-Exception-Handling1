public class FinalizeExample {
    public static void main(String[] args) {
        // Creating an object
        ResourceObject resource = new ResourceObject();

        // Making the object eligible for garbage collection
        resource = null;

        // Requesting garbage collection (not guaranteed when it will occur)
        System.gc();
    }
}

class ResourceObject {
    // Constructor
    public ResourceObject() {
        System.out.println("ResourceObject created.");
    }

    // Finalize method (called before garbage collection)
    @Override
    protected void finalize() throws Throwable {
        try {
            // Cleanup code for releasing resources (e.g., closing a file)
            System.out.println("Finalizing ResourceObject: Closing resources.");
        } finally {
            // Call the finalize method of the superclass
            super.finalize();
        }
    }
}
