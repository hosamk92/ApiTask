package com.api.task.apitask.libTest;
import com.api.task.apitask.controller.ApiControllers;

import org.junit.jupiter.api.Test;
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
class secondTaskTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void secondTask1() throws Exception {
        mvc.perform(get("/secondTask").param("input_string", "BFG"))
                .andExpect(status().isOk()).andExpect(content().string("1515"));
    }

    @Test
    public void secondTask2() throws Exception {
        mvc.perform(get("/secondTask").param("input_string", "AAA"))
                .andExpect(status().isOk()).andExpect(content().string("703"));
    }

    @Test
    public void secondTask3() throws Exception {
        mvc.perform(get("/secondTask").param("input_string", "AZA"))
                .andExpect(status().isOk()).andExpect(content().string("1353"));
    }

    @Test
    public void secondTask4() throws Exception {
        mvc.perform(get("/secondTask").param("input_string", "ABB"))
                .andExpect(status().isOk()).andExpect(content().string("730"));
    }

}


