package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashBackHackServiceTest {

    @Test
    void TestCodeWorks() {
        //1 подготовка данных. 2 выполнение целевого действия. 3. сравнение ожидаемого и фактического результата

        CashBackHackService cashBackHackService = new CashBackHackService(); //1
        int amount = 900;

        int actual = cashBackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);

    }
}