package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumAllOfSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sumOfAllSales(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSumSale() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageSumSale(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverageSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.belowAverageSales(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverageSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 26;
        int actual = service.aboveAverageSales(sale);
        Assertions.assertEquals(expected, actual);
    }
}
