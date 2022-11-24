package com.api.task.apitask.Lib;

public class thirdTask {

    public int[] thirdTask(int N, int[] X){
        int[] countsToZero = build();
        int[] ans = new int[N];
        for(int i = 0; i < N; i++){
            ans[i] = countsToZero[X[i]];
        }
        return ans;
    }

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
