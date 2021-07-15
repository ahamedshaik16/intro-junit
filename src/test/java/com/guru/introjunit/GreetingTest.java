package com.guru.introjunit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - called before class only one time");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Sohail"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After each....");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After - called before class only one time");
    }
}