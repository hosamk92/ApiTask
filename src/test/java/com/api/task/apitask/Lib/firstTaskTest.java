package com.api.task.apitask.Lib;
import com.api.task.apitask.Controller.ApiControllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ApiControllers.class)
public class firstTaskTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void firstTask1() throws Exception {
        mvc.perform(get("/firstTask")
                        .param("start_number", "1")
                        .param("end_number", "9"))
                .andExpect(status().isOk()).andExpect(content().string("8"));
    }

    @Test
    public void firstTask2() throws Exception {
        mvc.perform(get("/firstTask")
                        .param("start_number", "4")
                        .param("end_number", "17"))
                .andExpect(status().isOk()).andExpect(content().string("12"));
    }

    @Test
    public void firstTask3() throws Exception {
        mvc.perform(get("/firstTask")
                        .param("start_number", "40")
                        .param("end_number", "66"))
                .andExpect(status().isOk()).andExpect(content().string("15"));
    }

}


