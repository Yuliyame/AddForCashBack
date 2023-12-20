package ru.netology;

import static org.junit.Assert.assertEquals;

public class CashBackHackServiceTest {

    @org.junit.Test
    public void TestCodeWorks() {
        //1 подготовка данных. 2 выполнение целевого действия. 3. сравнение ожидаемого и фактического результата

        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 900;
        int actual = cashBackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);

    }
    @org.junit.Test
    public void BoundaryTestOne() {
        //1 подготовка данных. 2 выполнение целевого действия. 3. сравнение ожидаемого и фактического результата

        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 0;
        int actual = cashBackHackService.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);

    }
    @org.junit.Test
    public void BoundaryTestTwo() {
        //1 подготовка данных. 2 выполнение целевого действия. 3. сравнение ожидаемого и фактического результата

        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 1;
        int actual = cashBackHackService.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);

    }
    @org.junit.Test
    public void BoundaryTestThree() {
        //1 подготовка данных. 2 выполнение целевого действия. 3. сравнение ожидаемого и фактического результата

        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 999;
        int actual = cashBackHackService.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);

    }
    @org.junit.Test
    public void BoundaryTestFour() {
        //1 подготовка данных. 2 выполнение целевого действия. 3. сравнение ожидаемого и фактического результата

        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 1000;
        int actual = cashBackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }
    @org.junit.Test
    public void BoundaryTestFive() {
        //1 подготовка данных. 2 выполнение целевого действия. 3. сравнение ожидаемого и фактического результата

        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 1001;
        int actual = cashBackHackService.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);

    }
}