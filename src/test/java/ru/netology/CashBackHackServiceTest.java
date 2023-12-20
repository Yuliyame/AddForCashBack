package ru.netology;

import org.testng.asserts.Assertion;

import static org.testng.Assert.assertEquals;

public class CashBackHackServiceTest {

    @org.testng.annotations.Test

    public void TestCodeWorks() {
        //1 подготовка данных. 2 выполнение целевого действия. 3. сравнение ожидаемого и фактического результата

        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 900;

        int actual = cashBackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void TestBoundaryValueTwo() {
        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 0;

        int actual = cashBackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void TestBoundaryValueThree() {
        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 1;

        int actual = cashBackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void TestBoundaryValueFour() {
        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 999;

        int actual = cashBackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void TestBoundaryValueFive() {
        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 1000;

        int actual = cashBackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void TestBoundaryValueSix() {
        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 1001;

        int actual = cashBackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
