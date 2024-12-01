public class MilesToKilometers {
    public static void main(String[] args) {
        // Print the header of the table
        System.out.println("Miles\tKilometers");
        System.out.println("-------------------");
        
        // Loop to calculate and display miles and corresponding kilometers
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609; // Convert miles to kilometers
            System.out.printf("%-6d\t%.3f%n", miles, kilometers); // Print miles and kilometers
        }
    }
}
