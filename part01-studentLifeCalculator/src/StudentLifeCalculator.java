package src;

import java.util.Scanner;

public class StudentLifeCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Student Name: ");
        String name = scan.nextLine();   
        System.out.print("Student Age: ");
        int age = Integer.valueOf(scan.nextLine());   
        System.out.print("Exam Points: ");
        int examPoints = Integer.valueOf(scan.nextLine());  
        System.out.print("Monthly Income: ");
        int monthlyIncome = Integer.valueOf(scan.nextLine());  
        System.out.print("Monthly Rent: ");
        int monthlyRent = Integer.valueOf(scan.nextLine());  
        System.out.print("Monthly Food Expense: ");
        int monthlyFoodExpense = Integer.valueOf(scan.nextLine());  
        System.out.print("Monthly Transport Expense: ");
        int monthlyTransportExpense = Integer.valueOf(scan.nextLine());  
        System.out.print("Gift Money Received: ");
        int giftMoneyReceived = Integer.valueOf(scan.nextLine());  
    }
}