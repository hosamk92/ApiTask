package com.api.task.apitask.Lib;

public class secondTask {
    public long secondTaskImp(String input_string){
        long index = 0, base = 1;
        for(int i = input_string.length() - 1; i >= 0; i--){
            int a = input_string.charAt(i) - 'A' + 1;
            index += (a * base);
            base *= 26;
        }
        return index;
    }
}
