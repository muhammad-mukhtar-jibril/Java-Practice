package application;

/*
 * This class calculates the area and perimeter of a square
 * based on a given side length.
 */
public class AreaAndPerimeterCalculator {

    /*
     * This method calculates and prints:
     * - Area of a square (side × side)
     * - Perimeter of a square (4 × side)
     */
    static void CalculatorAreaAndPerimeter(int s) {

        // Calculate area using Math.pow (s²)
        int area = (int) Math.pow(s, 2);

        // Calculate perimeter (4 × side length)
        int perimeter = 4 * s;

        // Print results in a readable format
        System.out.println("The area of a square with " + s + " side length is: " + area + " m²");
        System.out.println("The perimeter of a square with " + s + " side length is: " + perimeter + " m");
    }

    public static void main(String[] args) {

        // Test the method with a sample value
        CalculatorAreaAndPerimeter(100);
    }
}