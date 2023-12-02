public class Example {
    public static void main(String[] args) {
        String str = null;


    if (str != null) {
    int length = str.length();
    System.out.println(length);
    } else {
    // Handle the case where str is null
    System.out.println("The string is null.");
     }

        try {
            // Attempting to invoke a method on a null object reference
            int length = str.length();
            System.out.println(length);
        } catch (NullPointerException e) {
            // Handle the exception, log it, or take appropriate action
            e.printStackTrace();
        }
    }
}