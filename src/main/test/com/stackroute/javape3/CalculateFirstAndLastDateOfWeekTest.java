package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculateFirstAndLastDateOfWeekTest {
    CalculateFirstAndLastDateOfWeek objCalculateFirstAndLastDateOfWeek;

    @Before
    public void setUp() {
        System.out.println("Before");
        objCalculateFirstAndLastDateOfWeek = new CalculateFirstAndLastDateOfWeek();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objCalculateFirstAndLastDateOfWeek = null;
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
    public void invokeCalculateMethosShouldReturnFirstAndLastDayOfWeek(){
        //arrange

        //act
        String result=objCalculateFirstAndLastDateOfWeek.calculateFirstAndLastDateOfWeek();

        //assert
        assertEquals("Mon 01/07/2019\n" +
                "Sun 07/07/2019",result);
    }
}