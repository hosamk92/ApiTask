package com.api.task.apitask.lib;

public class secondTask {

    /**
     * Get the index of the alphabetic string input_string.
     * @param input_string an alphabetic string
     * @return long the index of input_string.
     */
    public long getStrIndex(String input_string){
        long index = 0, base = 1;
        for(int i = input_string.length() - 1; i >= 0; i--){
            int a = input_string.charAt(i) - 'A' + 1;
            index += (a * base);
            base *= 26;
        }
        return index;
    }
}
