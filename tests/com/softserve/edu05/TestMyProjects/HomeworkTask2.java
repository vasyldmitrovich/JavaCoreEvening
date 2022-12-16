package com.softserve.edu05.TestMyProjects;

import com.softserve.edu05.MyProjects.HomeworkTask2.Main;
import org.junit.*;

public class HomeworkTask2 {

    private static Main main;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        main = new Main();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass tearDownAfterClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\t@Before setUp()");
    }

    //@Before
    public void setUp2() throws Exception {
        System.out.println("\t@Before setUp2()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\t@After tearDown()");
    }

    @Test(expected = ArithmeticException.class)
    public void testException() {
        System.out.println("\t\t@Test testException()");
        int i = 0;
        i = 10 / i;
        System.out.println("\t\t\ti = " + i);
    }

    @Test
    public void testSuma() {
        System.out.println("\t\t@Test testAdd1()");
        //Assert.fail("Not yet implemented");

        Main main = new Main();
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int actual;
        int expected = 5;

        actual = main.calcSuma(array);

        Assert.assertEquals(expected, actual);
        System.out.println("\t\t@Test testAdd1() - work correct");
    }

    @Test
    public void testProd() {
        System.out.println("\t\t@Test testAdd1()");
        //Assert.fail("Not yet implemented");

        Main main = new Main();
        int[] array = {1, -1, 1, 1, 1, 1, 2, 3, 1, 1};
        int actual;
        int expected = 6;

        actual = main.calcProd(array);

        Assert.assertEquals(expected, actual);
        System.out.println("\t\t@Test testAdd1() - work correct");
    }
}
