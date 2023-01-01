package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test

    public void testRemain900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(100);
        int expected = 900;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemain0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(actual, expected);
    }
}