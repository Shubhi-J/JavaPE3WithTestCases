package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculateFirstAndLastDateOfWeekTest {
    CalculateFirstAndLastDateOfWeek objCalculateFirstAndLastDateOfWeek;

    @Before
    public void setUp() {
        objCalculateFirstAndLastDateOfWeek = new CalculateFirstAndLastDateOfWeek();
    }
    @After
    public void tearDown () {
        objCalculateFirstAndLastDateOfWeek = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


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