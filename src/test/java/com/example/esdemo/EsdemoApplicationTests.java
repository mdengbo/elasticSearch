package com.example.esdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EsdemoApplication.class)
public class EsdemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("123");
    }

}