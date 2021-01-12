package com.example.application;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyTest {

    @Test
    public void hello() {
        System.out.println(getClass());
    }
}