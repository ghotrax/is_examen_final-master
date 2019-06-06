import gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle.PascalTriangle;
import org.junit.*;

import static org.junit.Assert.*;

public class PascalTriangleTest {
    public PascalTriangleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }



    @Test
    public void nivel3Input_entonces4breaksOutput() {
        System.out.println("TEST #1 - nivel3Input_entonces4breaksOutput");

        // given
        int input = 3;
        int expectedResult = 3;

        // when
        PascalTriangle pascalTriangle = new PascalTriangle();
        int actualResult = pascalTriangle.build(input).split("\n").length;

        // then
        assertEquals("TEST #1 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void unonivelInput_entonces4lineasOutput() {
        System.out.println("TEST #2 - unonivelInput_entonces4lineasOutput");

        // given
        int input = 1;
        int expectedResult = 4;

        // when
        PascalTriangle pascalTriangle = new PascalTriangle();
        int actualResult = pascalTriangle.build(input).length();

        // then
        assertEquals("TEST #2 FAILED!!!", expectedResult, actualResult);
    }



    @Test(expected = java.lang.OutOfMemoryError.class)
    public void cuandoAboveMaxIntInput_thenThrowsException() {
        System.out.println("TEST #3 - cuandoAboveMaxIntInput_thenThrowsException");

        // given
        int input = Integer.MAX_VALUE;
        String expectedResult = "";

        // when
        PascalTriangle pascalTriangle = new PascalTriangle();
        String actualResult = pascalTriangle.build(input);

        // then
        assertEquals("TEST #3 FAILED!!!", expectedResult, actualResult);
    }
    @Test
    public void cuandosolonivelInput_entoncessolonivelOutput() {
        System.out.println("TEST #4 - cuandosolonivelInput_entoncessolonivelOutput");

        // given
        int input = 1;
        String expectedResult = "[1]\n";

        // when
        PascalTriangle pascalTriangle = new PascalTriangle();
        String actualResult = pascalTriangle.build(input);

        // then
        assertEquals("TEST #4 FAILED!!!", expectedResult, actualResult);
    }
    @Test
    public void cuandoceronivelInput_entoncesvacionivelOutput() {
        System.out.println("TEST #5 - cuandoceronivelInput_entoncesvacionivelOutput");

        // given
        int input = 0;
        String expectedResult = "[]";

        // when
        PascalTriangle pascalTriangle = new PascalTriangle();
        String actualResult = pascalTriangle.build(input);

        // then
        assertEquals("TEST #5 FAILED!!!", expectedResult, actualResult);
    }
}
