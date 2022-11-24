package com.api.task.apitask.lib;

public class firstTask {

    /**
     * Count of all numbers between a range except numbers with a 5.
     * @param start_num the start number to start counting after inclusive
     * @param end_num the end number to count before inclusive
     * @return long the count between the start_number and the end_number without the digit '5'
     */
    public long firstTaskImp(long start_num, long end_num){
        // handle different cases +ve and -ve numbers.
        if(start_num > 0)
            return countWithoutFives(end_num) - countWithoutFives(start_num - 1);
        if(start_num == 0)
            return countWithoutFives(end_num) - countWithoutFives(start_num);
        if(end_num < 0)
            return countWithoutFives(-start_num) - countWithoutFives((-end_num) - 1);
        if(end_num == 0)
            return countWithoutFives(-start_num) - countWithoutFives(-end_num);

        // start_num is -ve and end_num is +ve
        return countWithoutFives(-start_num) + countWithoutFives(end_num) - 2;
    }

    /**
     * Count of all numbers between 0 and input number except numbers with a 5.
     * @param num the input number to count from zero to
     * @return long the count between the 0 and the num without the digit '5'
     */
    public long countWithoutFives(long num){
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
