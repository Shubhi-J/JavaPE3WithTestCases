package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class ExceptionHandlingTest {
    ExceptionHandling objExceptionHandling;

    @Before
    public void setUp() {
        objExceptionHandling = new ExceptionHandling();
    }
    @After
    public void tearDown () {
        objExceptionHandling = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


    @Test
    public void givenNegativeArrayLengthShouldReturnNegativeArrayException(){
        //arrange

        //act
        String result=objExceptionHandling.handleNegativeArraySizeException(-5);

        //assert
        assertEquals("negative array size exception",result);
    }

    @Test
    public void givenArraySize4AcccessingElementAt5ShouldReturnArrayOutOfBoundException(){
        //arrange

        //act
        String result=objExceptionHandling.handleArrayOutOfBoundException(4);

        //assert
        assertEquals("array index is out of array size",result);
    }

    @Test
    public void givenNullShouldReturnNullPointerException(){
        //arrange

        //act
        String result=objExceptionHandling.handleNullPointerException(null);

        //assert
        assertEquals("null pointer exception",result);
    }
}