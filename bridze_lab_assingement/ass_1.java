package bridze_lab_assingement;
import java.util.*;
public class ass_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Welcome to Bridgelabz
        System.out.println("1. Welcome to Bridgelabz!");
        System.out.println("Welcome to Bridgelabz!");
        System.out.println();

        // 2. Add Two Numbers
        System.out.println("2. Add Two Numbers");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("The sum is: " + (num1 + num2));
        System.out.println();

        // 3. Celsius to Fahrenheit
        System.out.println("3. Celsius to Fahrenheit Conversion");
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println();

        // 4. Area of a Circle
        System.out.println("4. Area of a Circle");
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
        System.out.println();

        // 5. Volume of a Cylinder
        System.out.println("5. Volume of a Cylinder");
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.println("Volume of the cylinder: " + volume);
        System.out.println();

        // 6. Calculate Simple Interest
        System.out.println("6. Calculate Simple Interest");
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + si);
        System.out.println();

        // 7. Perimeter of a Rectangle
        System.out.println("7. Perimeter of a Rectangle");
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter: " + perimeter);
        System.out.println();

        // 8. Power Calculation
        System.out.println("8. Power Calculation");
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();
        double power = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is " + power);
        System.out.println();

        // 9. Average of Three Numbers
        System.out.println("9. Average of Three Numbers");
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter third number: ");
        double c = sc.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println("Average: " + avg);
        System.out.println();

        // 10. Kilometers to Miles
        System.out.println("10. Convert Kilometers to Miles");
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println(km + " kilometers is equal to " + miles + " miles");

    }

}
