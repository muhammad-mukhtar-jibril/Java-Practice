package application;
public class AreaAndPerimeterCalculator {
  static void CalculatorAreaAndPerimeter(int s){
  int area = (int) Math.pow(s,2);
  int perimeter = 4 * s;
  System.out.println("The area of a square with " + s + " side length is: " + area + " m²");
  System.out.println("The perimeter of a square with " + s + " side length is: " + perimeter + " m");
  }
  public static void main(String[] args) {
  CalculatorAreaAndPerimeter(20);
  }
}
