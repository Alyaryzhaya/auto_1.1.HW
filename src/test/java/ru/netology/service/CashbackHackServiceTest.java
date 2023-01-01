package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void remainJunit4_1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

       Assert.assertEquals(expected, actual) ;


            }

    @Test
    public void remainJunit4_998() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2);
        int expected = 998;

        Assert.assertEquals(expected, actual) ;


    }

    @Test
    public void remainJunit4_0() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual) ;


    }
        };

