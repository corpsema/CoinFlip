/**
 * This class is the main class to test the CoinFlip.java class to compute and show the output of all the information
 * required by the question.
 *
 * @author Mohammad Abdulhussain
 *
 */

import java.util.Scanner;

public class TestCoinFlip
{
    /**
     * This method is the main method which calls the methods created in class CoinFlip.java, which requests the user
     * to input the total number of flips, and then calls the methods in CoinFlip.java to compute them.
     * This main class primarily relies on CoinFlip.java to compute and do all the necessary work so that it can
     * display the results through the main class.
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // requests for total number of inputs

        System.out.print("Enter number of flips: ");

        int flipTimes = input.nextInt();

        // computes the java class CoinFlip.java by computing the method of flipTimes which uses the class Math.random
        CoinFlip.flipIt(flipTimes);


        // Displays the total output of the heads, tails, and the longest heads run and longest tails run
        CoinFlip.display();
    }
}
