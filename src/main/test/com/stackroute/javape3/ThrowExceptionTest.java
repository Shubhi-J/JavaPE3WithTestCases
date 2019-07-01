package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class ThrowExceptionTest {
    ThrowException objThrowException;

    @Before
    public void setUp() {
        System.out.println("Before");
        objThrowException = new ThrowException();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objThrowException = null;
    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void tearDownAfterClass () {
        System.out.println("AfterClass");
    }


    @Test
    public void invokeThrowExceptionMethodShouldReturnExceptionAndFinallyBlockMessage() {
        //arrange

        //act
        String result=objThrowException.Exception();

        //assert
        assertEquals("Exception found\n" +
                "this message is coming from finally block",result);
    }
}