package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition objMatrixAddition;

    @Before
    public void setUp() {
        System.out.println("Before");
        objMatrixAddition = new MatrixAddition();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objMatrixAddition = null;
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
    public void givenTwoMatrixShouldReturnAddtionOfMatrices(){
        //arrange

        //act
        String result=objMatrixAddition.addTwoMatrix(new int[][]{{1,2},{3,4},{5,6}},new int[][]{{7,8},{9,10},{11,12}});

        //assert
        assertEquals("input number of rows of matrix 3\n" +
                "input number of columns of matrix 2\n" +
                "input elements of first matrix 1 2 3 4 5 6\n" +
                "input elements of second matrix 7 8 9 10 11 12\n" +
                "sum of the matrices 8 10\n" +
                " 12 14\n" +
                " 16 18",result);
    }


    @Test
    public void givenTwoMatrixWithUnmatchingRowsAndColumnsShouldReturnErrorMessage(){
        //arrange

        //act
        String result=objMatrixAddition.addTwoMatrix(new int[][]{{1,2},{3,4}},new int[][]{{7,8},{9,10},{11,12}});

        //assert
        assertEquals("number of rows and columns of both matrix should be same",result);
    }}