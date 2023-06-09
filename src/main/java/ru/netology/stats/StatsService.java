package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int sumOfAllSales(int[] sales) {
        int allSales = 0;

        for (int i = 0; i < sales.length; i++) {
            allSales += sales[i];
        }

        return allSales;
    }

    public int averageSumSale(int[] sales) {
        int averageSum = sumOfAllSales(sales);
        int average = averageSum / 12;

        return average;
    }

    public int belowAverageSales(int[] sales) {
        int belowAverage = 0;
        int belowAverageSale = averageSumSale(sales);
        for (int sale : sales) {
            if (sale > belowAverageSale) {
                belowAverage = belowAverage + 1;
            }
        }
        return belowAverage;
    }

    public int aboveAverageSales(int[] sales) {
        int aboveAverage = 0;
        int aboveAverageSale = averageSumSale(sales);
        for (int sale : sales) {
            if (sale < aboveAverageSale) {
                aboveAverageSale = aboveAverageSale + 1;
            }
        }
        return aboveAverageSale;
    }
}
