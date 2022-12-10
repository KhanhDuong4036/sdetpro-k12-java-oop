package lab_02;

import java.util.Scanner;

public class Lab021 {
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
        } else if (BMI < 24.9) {
            System.out.println("You're normal weight");
        } else if (BMI < 29.9) {
            System.out.println("You're overweight");
        } else {
            System.out.println("You're Obesity");
        }
    }

}
