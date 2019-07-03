package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class ThrowExceptionTest {
    ThrowException objThrowException;

    @Before
    public void setUp() {
        objThrowException = new ThrowException();
    }
    @After
    public void tearDown () {
        objThrowException = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


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