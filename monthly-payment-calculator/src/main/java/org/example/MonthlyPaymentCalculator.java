package org.example;

public class MonthlyPaymentCalculator {
    static void calculatePayment (int daysWorked, int paymentPerDay) {
        int monthlyNetPayment = (paymentPerDay * daysWorked);
        int monthlyTotalPayment = (daysWorked <= 25) ? (monthlyNetPayment) : (monthlyNetPayment + (daysWorked - 25) * 1000);
        System.out.println(monthlyTotalPayment);
    }
    public static void main(String[] args) {
        calculatePayment(25, 500);
        calculatePayment(30, 100);
        calculatePayment(30, 500);
    }
}