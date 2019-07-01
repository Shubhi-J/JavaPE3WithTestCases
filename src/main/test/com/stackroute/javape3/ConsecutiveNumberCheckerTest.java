package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class ConsecutiveNumberCheckerTest {
    ConsecutiveNumberChecker objConsecutiveNumberChecker;

    @Before
    public void setUp() {
        System.out.println("Before");
        objConsecutiveNumberChecker = new ConsecutiveNumberChecker();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objConsecutiveNumberChecker = null;
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
    public void givenConsecutiveNumbersShouldReturnConsectiveNumbersMessage(){
        //arrange

        //act
        String result=objConsecutiveNumberChecker.checkConsecutiveNumbers(new int[]{23,24,25,26,27,28,29});

        //assert
        assertEquals("[23,24,25,26,27,28,29] consecutive numbers",result);
    }

    @Test
    public void givenNonConsecutiveNumbersShouldReturnNonConsectiveNumbersMessage(){
        //arrange

        //act
        String result=objConsecutiveNumberChecker.checkConsecutiveNumbers(new int[]{25,24,25,26,27,28,29});

        //assert
        assertEquals("[25,24,25,26,27,28,29] non consecutive numbers",result);
    }

    @Test
    public void given8NonConsecutiveNumbersShouldReturnErrorMessage(){
        //arrange

        //act
        String result=objConsecutiveNumberChecker.checkConsecutiveNumbers(new int[]{89,25,24,25,26,27,28,29});

        //assert
        assertEquals("please enter 7 elements only",result);
    }
}