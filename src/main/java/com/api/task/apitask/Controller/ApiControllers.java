package com.api.task.apitask.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {

    @GetMapping(value = "/firstTask")
    public long firstTask(long start_num, long end_num){
        return firstTaskImp(start_num, end_num);
    }

    public long firstTaskImp(long start_num, long end_num){
        if(start_num > 0)
            return countImp(end_num) - countImp(start_num - 1);
        if(start_num == 0)
            return countImp(end_num) - countImp(start_num);
        if(end_num < 0)
            return countImp(-start_num) - countImp((-end_num) - 1);
        if(end_num == 0)
            return countImp(-start_num) - countImp(-end_num);

        return countImp(-start_num) + countImp(end_num) - 2;
    }
    public long countImp(long num){
        long countPerCycle = 0, ans = 0, counter = 1;
        while(num > 0){
            int numAt = (int) (num % 10);
            if (numAt == 5) ans = counter - countPerCycle - 1;
            if (numAt >= 5) numAt -= 1;
            ans += (numAt * counter) - (countPerCycle * numAt);
            countPerCycle = (countPerCycle * 9) + counter;
            counter *= 10;
            num /= 10;
        }

        return ans + 1;
    }

    @GetMapping(value = "/secondTask")
    public long secondTask(String input_string){
        return secondTaskImp(input_string.toUpperCase());
    }

    public long secondTaskImp(String input_string){
        long index = 0, base = 1;
        for(int i = input_string.length() - 1; i >= 0; i--){
            int a = input_string.charAt(i) - 'A' + 1;
            index += (a * base);
            base *= 26;
        }
        return index;
    }

    @GetMapping(value = "/thirdTask")
    public int thirdTaskAPI(int input_num){
        int[] countsToZero = build();
        return countsToZero[input_num];
    }

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
