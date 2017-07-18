package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum;
        double difference;
        double multiplication;
        double division;
        double remainder;
        String firstNumber;
        String secondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        firstNumber = scanner.nextLine();
        double operand1 = Double.parseDouble(firstNumber);


        System.out.println("Enter the second number: ");
        secondNumber = scanner.nextLine();
        double operand2 = Double.parseDouble(secondNumber);


        sum = operand1 + operand2;

        difference = operand1  - operand2;

        multiplication = operand1 * operand2;

        division = operand1 / operand2;

        remainder = operand1 % operand2;

        showResults(sum, difference, multiplication, division, remainder);

    }

    public static void showResults( double sum, double difference, double multiplication, double division, double remainder) {
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + multiplication);
        System.out.println("The quotient is: " + division);
        System.out.println("The remainder is: " + remainder);

    }
}
