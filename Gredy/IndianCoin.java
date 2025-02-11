package Gredy;
//Indian Coin Change Problem

import java.util.ArrayList;

//Tc: O(n)
//canonical coin system

import java.util.Arrays;
import java.util.Comparator;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());
        int countOfCoins = 0;
        int amount = 1069;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                while (coins[i] <= amount) {
                    amount -= coins[i];
                    ans.add(coins[i]);
                    countOfCoins++;
                }
            }
        }
        System.out.println("Minimum Number of Coins: " + countOfCoins);
        System.out.println("Coins used are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
