package ru.netology.stats;

public class StatsService {
    public long arraySum(long[] sales) {

        int sum = 0;
        for (long element : sales) {
            sum += element;
        }
        return sum;
    }

    public long averageSum(long[] sales) {

        int averSum = 0;
        int sum = 0;
        for (long element : sales) {
            sum += element;
        }
        averSum = sum / sales.length;
        return averSum;
    }

    public long maxSumMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long element : sales) {
            if (element >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSumMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long element : sales) {
            if (element <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long monthMaxAverage(long[] sales) {

        int sum = 0;
        int averSum = 0;
        for (long element : sales) {
            sum += element;
        }
        averSum = sum / sales.length;

        long amountMonthMax = 0;
        for (long element : sales) {
            if (element > averSum) {
                element = 1;
            } else element = 0;
            amountMonthMax += element;
        }
        return amountMonthMax;
    }

    public long monthMinAverage(long[] sales) {

        int sum = 0;
        int averSum = 0;
        for (long element : sales) {
            sum += element;
        }
        averSum = sum / sales.length;

        long amountMonthMin = 0;
        for (long element : sales) {
            if (element < averSum) {
                element = 1;
            } else element = 0;
            amountMonthMin += element;
        }
        return amountMonthMin;
    }
}


