package com.softserve.edu05.TestMyProjects;

import com.softserve.edu05.MyProjects.HomeworkTask1.Main;
import com.softserve.edu05.apptest.Calc;
import org.junit.*;

public class HomeworkTask1 {
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
    public void testOutputString() {
        System.out.println("\t\t@Test testAdd1()");
        //Assert.fail("Not yet implemented");

        Main main = new Main();
        String actual;
        String expected;

        actual = main.calcNumMouth(1);
        expected = "There are 31 days.";

        Assert.assertEquals(expected, actual);
        System.out.println("\t\t@Test testAdd1() - work correct");
    }
}
