package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {
    @Test
    void findMax() {
        StatisticService service = new StatisticService();
        long[] incomesInBillions = {1, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
    @Test
    void findMax2() {
        StatisticService service = new StatisticService();
        long[] incomesInBillions = {3, 10, 9, 2, 11, 4, 8, 1, 7, 5, 6};
        long expected = 11;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);

    }
}
