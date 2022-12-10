package lab_02;

import java.util.Scanner;

public class Lab023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height (m): ");
        double height = scanner.nextDouble();
        System.out.print("Please enter your weight (kg): ");
        double weight = scanner.nextDouble();
        double BMI = weight / (height * 2);
        System.out.println((double) Math.round(BMI * 10) / 10);
        if (BMI <= 18.5) {
            System.out.println("You're underweight");
            System.out.println("Please increase your weight!");
        } else if (BMI < 24.9) {
            System.out.println("You're normal weight");
            System.out.println("Please keep your current weight!");
        } else if (BMI < 29.9) {
            System.out.println("You're overweight");
            System.out.println("Please decrease your weight!");
        } else {
            System.out.println("You're Obesity");
            System.out.println("Please decrease your weight!");
        }
    }
}
