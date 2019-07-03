package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {
    ChessBoardPattern objChessBoardPattern;

    @Before
    public void setUp() {
        objChessBoardPattern = new ChessBoardPattern();
    }
    @After
    public void tearDown () {
        objChessBoardPattern = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}
    @AfterClass
    public static void tearDownAfterClass (){}


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