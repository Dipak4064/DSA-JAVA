package Gredy;
//Fractional knapsack problem

import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;
        double ratio[][] = new double[val.length][2];
        // oth col => 1st col => ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) val[i] / weight[i];
        }
        // labda function
        // ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int finalVal =0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {//can include full item
                finalVal +=val[idx];
                capacity-=weight[idx];
            }else{
                //include fractional item
                finalVal +=(ratio[i][1]*capacity);
                capacity =0;
                break;
            }
        }
        System.out.println("Maximum Profit: "+finalVal);
    }

}
