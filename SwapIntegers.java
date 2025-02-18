public class SwapIntegers
{
    public static void swap(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a; // Store the value of 'a' in a temporary variable
        a = b;       // Assign the value of 'b' to 'a'
        b = temp;      // Assign the value of 'temp' (originally 'a') to 'b'

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        swap(num1, num2); // Call the swap method
    }
}
