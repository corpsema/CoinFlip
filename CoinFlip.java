/**
 * This class models a CoinFlip to determine whether it is heads or tails by determining
 * whether it is above .5, in which case it is heads, otherwise it is false. In addition,
 * this program computes the total count of heads and tails by user input X, and would
 * output the longest run for heads and tails.
 *
 * @author Mohammad Abdulhussain
 *
 */

public class CoinFlip
{
    /**
     * This constructor recieves the input from the user on how many times it is meant to roll heads or tails
     * and outputs heads or tails, and the longest run of heads and longest run of tails
     * @param flipTimes
     */

    private static Boolean[] coins;

    public static void display()
    {
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < coins.length; i++)
        {
            if (coins[i] == false)
            {
                System.out.print("Heads");
                heads++;
            }
            else
            {
                System.out.print("Tails");
                tails++;
            }

            System.out.print((i + 1) % 10 == 0 ? "\n" : "\t");
        }
        System.out.println("\nThe results of the coin flip are:\n");
        System.out.println("\n\nHeads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println("Longest heads run: " + computeLongestRunHeads());
        System.out.println("Longest tails run: " + computeLongestRunTails());
    }

    /**
     * This method flips the coin by using Math.random class. If the value is above .5, it then assigns a value of true
     * which is heads, otherwise it assigns a value of false, which is tails.
     * @param flipTimes
     */
    public static void flipIt(int flipTimes)
    {
        coins = new Boolean[flipTimes];

        int i = 0;

        while (i < flipTimes)
        {
            boolean result = false;

            if (Math.random() > 0.5)
            {
                result = true;
            }

            store(result, i);

            i++;
        }
    }

    /**
     * This method stores the results, and outputs the results whether it may be heads or tails
     * @param result
     */
    private static void store(boolean result, int index) { coins[index] = result; }

    private static int computeLongestRunHeads()
    {
        int longest = 0;
        int current = 0;

        for (Boolean coin : coins)
        {
            if (coin == false)
            {
                current++;
            }
            else
            {
                if (current > longest)
                {
                    longest = current;
                }

                current = 0;
            }
        }

        return longest;
    }

    private static int computeLongestRunTails()
    {
        int longest = 0;
        int current = 0;

        for (Boolean coin : coins)
        {
            if (coin == true)
            {
                current++;
            }
            else
            {
                if (current > longest)
                {
                    longest = current;
                }

                current = 0;
            }
        }
        return longest;
    }
}
