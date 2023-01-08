package com.softserve.edu05.Homework.Task_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class DaysInAMonthTest {

    @Test
    public void inputOne() {
        var daysInAMonth = new DaysInAMonth();
        int actual = daysInAMonth.whichMonth(1);
        int expected = 31;
        assertEquals(expected, actual);
    }
    @Test
    public void inputTwo() {
        var daysInAMonth = new DaysInAMonth();
        int actual = daysInAMonth.whichMonth(2);
        int expected = 28;
        assertEquals(expected, actual);
    }
    @Test
    public void inputThree() {
        var daysInAMonth = new DaysInAMonth();
        int actual = daysInAMonth.whichMonth(3);
        int expected = 31;
        assertEquals(expected, actual);
    }
    @Test
    public void inputFour() {
        var daysInAMonth = new DaysInAMonth();
        int actual = daysInAMonth.whichMonth(4);
        int expected = 30;
        assertEquals(expected, actual);
    }
    @Test
    public void inputFive() {
        var daysInAMonth = new DaysInAMonth();
        int actual = daysInAMonth.whichMonth(5);
        int expected = 31;
        assertEquals(expected, actual);
    }
    @Test
    public void inputSix() {
        var daysInAMonth = new DaysInAMonth();
        int actual = daysInAMonth.whichMonth(6);
        int expected = 30;
        assertEquals(expected, actual);
    }
    @Test
    public void inputSeven() {
        var daysInAMonth = new DaysInAMonth();
        int actual = daysInAMonth.whichMonth(7);
        int expected = 31;
        assertEquals(expected, actual);
    }@Test
    public void inputEight() {
        var daysInAMonth = new DaysInAMonth();
        int actual = daysInAMonth.whichMonth(8);
        int expected = 31;
        assertEquals(expected, actual);
    }
    @Test
    public void inputNine() {
        var daysInAMonth = new DaysInAMonth();
        int actual = daysInAMonth.whichMonth(9);
        int expected = 30;
        assertEquals(expected, actual);
    }@Test
    public void inputTen() {
        var daysInAMonth = new DaysInAMonth();
        int actual = daysInAMonth.whichMonth(10);
        int expected = 31;
        assertEquals(expected, actual);
    }
    @Test
    public void inputEleven() {
        var daysInAMonth = new DaysInAMonth();
        int actual = daysInAMonth.whichMonth(11);
        int expected = 30;
        assertEquals(expected, actual);
    }
    @Test
    public void inputTwelve() {
        var daysInAMonth = new DaysInAMonth();
        int actual = daysInAMonth.whichMonth(12);
        int expected = 31;
        assertEquals(expected, actual);
    }
}