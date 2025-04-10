import java.util.Scanner;
public class budgetTracker {
    public static void main(String[] args) {
        //setting up the scanner class
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your monthly income: $");
        //promting user and taking the required inputs
        double income = myScanner.nextDouble();
        System.out.print("Enter your monthly rent: $");
        double rent = myScanner.nextDouble();
        System.out.print("Enter your monthly groceries expense: $");
        double groceries = myScanner.nextDouble();
        System.out.print("Enter your monthly transportation expense: $");
        double transportation = myScanner.nextDouble();
        System.out.print("Enter your monthly entertainment expense: $");
        double entertainment = myScanner.nextDouble();
        //printing  out the budget summary below
        System.out.println("\n********** Budget Summary **********");
        System.out.println( String.format("Monthly Income: $%.2f", income));
        double totalExpenses = rent + groceries + transportation + entertainment;
        System.out.println( String.format("Total Expenses: $%.2f", totalExpenses));
        double remainingBudget = income - totalExpenses;
        System.out.println( String.format("Remaining Budget: $%.2f", remainingBudget));
        System.out.println("Expenses Breakdown:");
        //Calculating each expense as prcentage of income
        double rentPercentage = (rent / income) *100;
        double groceriesPercentage = (groceries / income) *100;
        double transportationPercentage = (transportation / income) * 100;
        double entertainmentPercentage = (entertainment / income) * 100;
        System.out.println(String.format("\tRent:  $%.2f (%.2f  of income)", rent, rentPercentage));
        System.out.println(String.format("\tGroceries:  $%.2f (%.2f  of income)", groceries, groceriesPercentage));
        System.out.println(String.format("\tTransportation:  $%.2f (%.2f  of income)", transportation, transportationPercentage));
        System.out.println(String.format("\tEntertainment:  $%.2f (%.2f  of income)", entertainment, entertainmentPercentage));
        System.out.println("************************************\n");
    }
}