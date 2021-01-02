/*
Loan Calculator

You take a loan from a friend and need to calculate how much you will owe him after 6 months.
You are going to pay him back 10% of the remaining loan amount each month.
Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 6 months.

Sample Input:
20000

Sample Output:
10628

Here is the monthly payment schedule:
Month 1
Payment: 10% of 20000 = 2000
Remaining amount: 18000
Month 2
Payment: 10% of 18000 = 1800
Remaining amount: 16200
Month 3:
Payment: 10% of 16200 = 1620
Remaining amount: 14580
Month 4:
Payment: 10% of 14580 = 1458
Remaining amount: 13122
Month 5:
Payment: 10% of 13122 = 1313
Remaining amount: 11809
Month 6:
Payment: 10% of 11809 = 1181
Remaining amount: 10628
Use a loop to calculate the payment and remaining amounts for each month.
Also, use integers for amounts.
 */
import java.util.Scanner;
public class loanCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount, payment, i;
        amount = sc.nextInt();

        for (i=1; i<=6; i++)
        {
            payment = (10 * amount) / 100;
            amount = (amount-1) - payment;
        }
        System.out.println(amount+1);
        sc.close();
    }
}