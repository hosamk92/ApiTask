package com.api.task.apitask.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.task.apitask.Lib.firstTask;
import com.api.task.apitask.Lib.secondTask;

@RestController
public class ApiControllers {

    @GetMapping(value = "/firstTask")
    public long firstTask(long start_number, long end_number){
        firstTask t1 = new firstTask();
        return t1.firstTaskImp(start_number, end_number);
    }

    @GetMapping(value = "/secondTask")
    public long secondTask(String input_string){
        secondTask t2 = new secondTask();
        return t2.secondTaskImp(input_string.toUpperCase());
    }


}
