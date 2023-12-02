public class Example {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempting to access an element outside the valid range
            int value = numbers[10];
            System.out.println(value);
        } catch (IndexOutOfBoundsException e) {
            // Handle the exception, log it, or take appropriate action
            e.printStackTrace();
        }
    }
}
