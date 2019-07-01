package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {
    ChessBoardPattern objChessBoardPattern;

    @Before
    public void setUp() {
        System.out.println("Before");
        objChessBoardPattern = new ChessBoardPattern();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objChessBoardPattern = null;
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
    public void invokeDrawChessPatternMethosShouldReturnChessBoardPattern(){
        //arrange

        //act
        String result=objChessBoardPattern.drawChessBoardPattern();

        //assert
        assertEquals("WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|",result);
    }

}