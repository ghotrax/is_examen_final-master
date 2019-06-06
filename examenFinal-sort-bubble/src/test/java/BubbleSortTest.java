
import gt.edu.umg.ingenieria.sistemas.is.examenfinal.sort.bubble.BubbleSort;
import org.junit.*;

import static org.junit.Assert.*;

public class BubbleSortTest {
    public BubbleSortTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }



    @Test
    public void cuandoNullInput_entoncesNullOutput() {
        System.out.println("TEST #1 - cuandoNullInput_entoncesNullOutput");

// given
        int[] input = null;
        int[] expectedResult = null;

// when
        int[] actualResult = BubbleSort.sortBasic(input);

// then
        assertArrayEquals("TEST #1 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void cuandoOrderedInput_EntoncesMantainsOutput() {
        System.out.println("TEST #2 - cuandoOrderedInput_EntoncesMantainsOutput");

// given
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

// when
        int[] actualResult = BubbleSort.sortBasic(input);

// then
        assertArrayEquals("TEST #2 FAILED!!!", expectedResult, actualResult);
    }


    @Test
    public void cundovacioInput_EntoncesVacioOutput() {
        System.out.println("TEST #3 - cundovacioInput_EntoncesVacioOutput");

// given
        int[] input = new int[]{};
        int[] expectedResult = new int[]{};

// when
        int[] actualResult = BubbleSort.sortBasic(input);

// then
        assertArrayEquals("TEST #3 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void  cuandounoduplicadoInput_EntoncesMantainsOutput() {
        System.out.println("TEST #4 - cuandounoduplicadoInput_EntoncesMantainsOutput");

// given
        int[] input = new int[]{1, 1, 1, 1};
        int[] expectedResult = new int[]{1, 1, 1, 1};

// when
        int[] actualResult = BubbleSort.sortBasic(input);

// then
        assertArrayEquals("TEST #4 FAILED!!!", expectedResult, actualResult);
    }
    @Test
    public void cuandoUnorderedInput_EntoncesOrderedOutput() {
        System.out.println("TEST #5 - cuandoUnorderedInput_EntoncesOrderedOutput");

// given
        int[] input = new int[]{1, 2, 3, 5, 4};
        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

// when
        int[] actualResult = BubbleSort.sortBasic(input);

// then
        assertArrayEquals("TEST #5 FAILED!!!", expectedResult, actualResult);
    }
}