package com.api.task.apitask.lib;

public class thirdTask {

    /**
     * Get the index of the alphabetic string input_string.
     * @param N the length of input array
     * @param X List of queries needed to reduce to 0
     * @return List of integers containing the minimum number of steps needed to reduce X to 0
     */
    public int[] getMinCount(int N, int[] X){
        int[] countsToZero = build();
        int[] ans = new int[N];
        for(int i = 0; i < N; i++){
            ans[i] = countsToZero[X[i]];
        }
        return ans;
    }

    /**
     * Build the minimum steps needed steps to reduce each element from 0 to 10^4 to zero.
     * @return List of integers containing the minimum number of steps needed to reduce X to 0
     */
    public int[] build(){
        int[] countsToZero = new int[10001];
        countsToZero[0] = 0;
        countsToZero[1] = 1;
        for(int num = 2; num <= 10000; num++){
            int minCount = countsToZero[num - 1] + 1;
            for (int divisor = 2; divisor <= Math.sqrt(num); divisor++)
                if (num % divisor == 0)
                    minCount = Math.min(minCount, countsToZero[Math.max(divisor, num/divisor)] + 1);

            countsToZero[num] = minCount;
        }

        return countsToZero;
    }
}
