package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void testCalculatePayment_NoBonus() {
        int daysWorked = 20;
        int paymentPerDay = 300;
        int expectedMonthlyPayment = 6000; // 20 days * 100 per day - no bonus
        int actualMonthlyPayment = MonthlyPaymentCalculator.calculatePayment(daysWorked, paymentPerDay);
        assertEquals(actualMonthlyPayment, expectedMonthlyPayment);
    }

    @Test
    public void testCalculatePayment_WithBonus() {
        int daysWorked = 30;
        int paymentPerDay = 250;
        int expectedMonthlyPayment = 12500; // (25 days * 100 per day) + (5 * 1000 per extra day)
        int actualMonthlyPayment = MonthlyPaymentCalculator.calculatePayment(daysWorked, paymentPerDay);
        assertEquals(actualMonthlyPayment, expectedMonthlyPayment);
    }

    @Test
    public void testCalculatePayment_ZeroDaysWorked() {
        int daysWorked = 0;
        int paymentPerDay = 100;
        int expectedMonthlyPayment = 0; // No days worked, so payment should be zero
        int actualMonthlyPayment = MonthlyPaymentCalculator.calculatePayment(daysWorked, paymentPerDay);
        assertEquals(actualMonthlyPayment, expectedMonthlyPayment);
    }

}


