package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StatsServiceTest {
    @Test
    public void shouldMinMonthSales() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minSales(month);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMaxMonthSales() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxSales(month);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumSales(month);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldAverSumInMonthSales() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averSumSales(month);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCountMonthSaleLessAverSumInMontSales() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.lessAverSumSales(month);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCountMonthSaleHigherAverSumInMontSales() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.higherAverSumSales(month);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}


