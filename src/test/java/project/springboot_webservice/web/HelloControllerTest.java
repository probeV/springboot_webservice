package project.springboot_webservice.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void hello리턴() throws Exception{
        String hello = "hello";

        assertThat(mvc.perform(get("/hello"))).isEqualTo(hello);
    }


}