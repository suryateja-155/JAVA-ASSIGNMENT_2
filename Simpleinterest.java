public class Simpleinterest
{
    public static void main(String[] args) {
        // Hardcoded values for principal, time, and rate of interest
        double principal = 1000.0;  // Example principal amount
        double time = 2.0;          // Example time period in years
        double rate = 5.0;          // Example rate of interest in percentage

        // Calculate Simple Interest using the formula: SI = (P * T * R) / 100
        double simpleInterest = (principal * time * rate) / 100;

        // Print the result
        System.out.println("The Simple Interest is: " + simpleInterest);
    }
}
