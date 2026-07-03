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

        String studentStatus = "";
        String grade = "";
        String remainingMoneyText = "";
        String scholarship = "";
        String giftTaxStatus = "";
        String result = "";
        double tax = 0;
        int totalExpenses = 0;
        int remainingMoney = 0;
        if (age >= 18) {
            studentStatus = "Adult Student";
        }
        else {
            studentStatus = "Underage Student";
        }

        if (examPoints>=60) {
            result = "Passed";
        }
        else if (examPoints<60) {
            result = "Failed";
        }

        if (examPoints == 100) {
            grade = "Incredible";
        }
        else if (examPoints > 90) {
            grade = "AA";
        }
        else if (examPoints > 80) {
            grade = "BB";
        }
        else if (examPoints > 70) {
            grade = "CB";
        }
        else if (examPoints >=60) {
            grade = "CC";
        }
        else {
            grade = "FF";
        }

        totalExpenses = monthlyRent+monthlyFoodExpense+monthlyTransportExpense;
        remainingMoney = monthlyIncome - totalExpenses;

        if (remainingMoney > 0 ) {
            remainingMoneyText = "You saved money this month";           
        }
        else if (remainingMoney == 0) {
            remainingMoneyText = "Your budget is balanced";
        }
        else {
            remainingMoneyText = "You spent more than you earned";
        }

        if (examPoints >= 80 && monthlyIncome < 15000) {
            scholarship = "Eligible for scholarship";
        }
        else {
            scholarship = "Not eligible for scholarship";
        }

        if (giftMoneyReceived >= 5000) {
            tax = giftMoneyReceived * 0.25;
            giftTaxStatus = "Your tax is: " + tax;
        }
        else if (giftMoneyReceived < 5000) {
            giftTaxStatus = "No tax";
        }

        System.out.println("\nStudent report for "+name);
        System.out.println("Age Status: "+studentStatus);
        System.out.println("Grade: "+grade);
        System.out.println("Result: "+result);
        System.out.println("\nTotal Expenses: "+totalExpenses);
        System.out.println("Remaining Money: "+remainingMoney);
        System.out.println("Budget Status: "+remainingMoneyText);
        System.out.println("\nScholarship Status: "+scholarship);
        System.out.println("Gift Tax Status: "+giftTaxStatus);
    }
}