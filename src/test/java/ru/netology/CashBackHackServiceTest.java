package ru.netology;

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
    public void TestSecondTest() {
        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 1000;

        int actual = cashBackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
