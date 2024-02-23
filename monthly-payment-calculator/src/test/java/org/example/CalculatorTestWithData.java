package org.example;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTestWithData {

    @Test(dataProvider = "paymentData")
    public void testCalculatePayment(int daysWorked, int paymentPerDay, int expectedMonthlyPayment) {
        int actualMonthlyPayment = MonthlyPaymentCalculator.calculatePayment(daysWorked, paymentPerDay);
        assertEquals(actualMonthlyPayment, expectedMonthlyPayment);
    }

    @DataProvider(name = "paymentData")
    public Object[][] paymentData() {
        return new Object[][] {
                {20, 1000, 20000},
                {30, 250, 12500},
                {0,100, 0},
                {40, 500, 35000}
        };
    }
}
