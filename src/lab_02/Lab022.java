package lab_02;

import java.util.Scanner;

public class Lab022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your number: ");
        int number = scanner.nextInt();
        if(number % 2 ==0){
            System.out.println("This is an even number");
        }else {
            System.out.println("This is an odd number ");
        }
    }
}
