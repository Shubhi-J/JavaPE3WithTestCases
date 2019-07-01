package com.stackroute.javape3;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelRemoverTest {
    VowelRemover objVowelRemover;

    @Before
    public void setUp() {
        System.out.println("Before");
        objVowelRemover = new VowelRemover();
    }
    @After
    public void tearDown () {
        System.out.println("After");
        objVowelRemover = null;
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
    public void givenStringArrayShouldReturnStringArrayWithoutVowels() {
        //arrange

        //act
        String result=objVowelRemover.removeVowels(new String[]{"India","United States","London","South Africa"});

        //assert
        assertEquals("place name without vowel at 0 Ind\n" +
                "place name without vowel at 1 Untd Stts\n" +
                "place name without vowel at 2 Lndn\n" +
                "place name without vowel at 3 Sth Afrc\n",result);
    }

    @Test
    public void givenStringArrayWithoutVowelsShouldReturnSameStringArray() {
        //arrange

        //act
        String result=objVowelRemover.removeVowels(new String[]{"ytgh","nbhy","wrd","mnb nn"});

        //assert
        assertEquals("place name without vowel at 0 ytgh\n" +
                "place name without vowel at 1 nbhy\n" +
                "place name without vowel at 2 wrd\n" +
                "place name without vowel at 3 mnb nn\n",result);
    }

    @Test
    public void givenNumericArrayShouldReturnErrorMessage() {
        //arrange

        //act
        String result=objVowelRemover.removeVowels(new String[]{"111","wqq","22","3333 22"});

        //assert
        assertEquals("input string is a numeric string",result);
    }

}