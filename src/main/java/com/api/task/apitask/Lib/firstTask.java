package com.api.task.apitask.Lib;

public class firstTask {
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
}
