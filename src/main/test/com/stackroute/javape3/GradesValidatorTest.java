package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class GradesValidatorTest {
    GradesValidator objGradesValidator;

    @Before
    public void setUp() {
        objGradesValidator = new GradesValidator();
    }
    @After
    public void tearDown () {
        objGradesValidator = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


    @Test
    public void givenGradesofFourInRangeShouldReturnMinMaxAverage(){
        //arrange

        //act
        String result=objGradesValidator.validateGrades(4,new int[] {89,90,67,87});

        //assert
        assertEquals("the grades are in range",result);
    }

    @Test
    public void givenGradesofFiveOutOfRangeShouldReturnErrorMessage(){
        //arrange

        //act
        String result=objGradesValidator.validateGrades(5,new int[] {89,105,67,87,0});

        //assert
        assertEquals("the grade should be between 0 and 100",result);
    }

    @Test
    public void givenFourStudentsFiveGradesShouldReturnErrorMessage(){
        //arrange

        //act
        String result=objGradesValidator.validateGrades(4,new int[] {89,99,67,87,0});

        //assert
        assertEquals("Number of grades can not exceed the number of students",result);
    }


    @Test
    public void givenGradesofFourAsStringShouldReturnErrorMessage(){
        //arrange

        //act
        String result=objGradesValidator.validateGrades(4,new int[] {89,'u',67,87});

        //assert
        assertEquals("the grade should be between 0 and 100",result);
    }


}