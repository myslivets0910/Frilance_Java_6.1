package org.example.Frilance_Java_6.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidayServiceTest {
    @Test
    public void CalcCacheMonthsOne() {
        HolidayService service = new HolidayService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculateMoney(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalcCacheMonthsTwo() {
        HolidayService service = new HolidayService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculateMoney(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}
