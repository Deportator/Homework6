package ru.netology.stats;
public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }
    public long sumSales(int[] sales) {
        int sumMonth = 0;
        for (int sale : sales) {
            sumMonth += sale;
        }
        return sumMonth;
    }
    public long averSumSales(int[] sales) {
        long averSumMonth = sumSales(sales) / 12;

        return averSumMonth;
    }
    public long lessAverSumSales(int[] sales) {
        int averSumMonth = 0;
        int month = 0;
        for (int sale : sales) {
            month += sale;
        }
        for (int sale : sales) {
            if (sale < averSumSales(sales)) {
                averSumMonth += 1;
            }
        }
        return averSumMonth;
    }

    public long higherAverSumSales(int[] sales) {
        int averSumMonth = 0;
        int month = 0;
        for (int sale : sales) {
            month += sale;
        }
        for (int sale : sales) {
            if (sale > averSumSales(sales)) {
                averSumMonth += 1;
            }
        }
        return averSumMonth;
    }
}

