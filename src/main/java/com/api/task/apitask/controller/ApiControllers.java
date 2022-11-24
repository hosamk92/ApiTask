package com.api.task.apitask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.task.apitask.lib.firstTask;
import com.api.task.apitask.lib.secondTask;

@RestController
public class ApiControllers {

     /**
     * GET API for the first task
     * Count of all numbers between a range except numbers with a 5.
     * @param start_number the start number to start counting after inclusive
     * @param end_number the end number to count before inclusive
     * @return long the count between the start_number and the end_number without the digit '5'
     */
    @GetMapping(value = "/firstTask")
    public long firstTask(long start_number, long end_number){
        firstTask t1 = new firstTask();
        return t1.firstTaskImp(start_number, end_number);
    }

     /**
     * GET API for the second task
     * Get the index of the alphabetic string input_string.
     * @param input_string an alphabetic string
     * @return long the index of input_string.
     */
    @GetMapping(value = "/secondTask")
    public long secondTask(String input_string){
        secondTask t2 = new secondTask();
        return t2.getStrIndex(input_string.toUpperCase());
    }


}
