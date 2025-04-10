import java.util.Scanner;

public class budgetTrackerPro {
    public static void main(String args[]) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their monthly income
        System.out.print("Enter your monthly income: $" );
        double income = scanner.nextDouble();
        scanner.nextLine();
        // Initialize variables for expenses
        double totalExpense = 0;
        // Prompt the user to enter the number of expenses they want to track
        // Remember to consume the newline left-over
        // TODO

        // TODO
        System.out.print("Enter the number of expenses: ");
        int numExpenses = scanner.nextInt();
        scanner.nextLine();


        // Loop to track each expense
        // TODO
        for (int i =1; i <= numExpenses; i++) {
            System.out.print(String.format("Enter expense %d: ", i));
            double expense = scanner.nextDouble();
            scanner.nextLine();
            totalExpense += expense;
        }

        // Calculate the remaining balance
        // TODO
        double remainingBalance = income - totalExpense;

        // Display the total income, total expenses, and remaining balance
        // TODO
        System.out.println(String.format("\nTotal Income: $%.2f", income));
        System.out.println(String.format("Total Expenses: $%.2f", totalExpense));
        System.out.println(String.format("Remaining Balance: $%.2f",remainingBalance));

        // Provide a financial warning if expenses exceed income
        // TODO
        if (remainingBalance < 0) {
            System.out.println("Your expenses has exceeded your income");
        }
    }
}