package org.example;

public class MonthlyPaymentCalculator {
    public static int calculatePayment (int daysWorked, int paymentPerDay) {
        int monthlyNetPayment = (paymentPerDay * daysWorked);
        //To calculate monthly pay and add bonus if there is any
        int monthlyTotalPayment = (daysWorked <= 25) ? (monthlyNetPayment) : (monthlyNetPayment + (daysWorked - 25) * 1000);
        return monthlyTotalPayment;
    }
}