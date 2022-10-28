package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {
    InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    @Test
    public void givenDistanceAndTime_ShouldReturnFare() {
        double distance = 3.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(35, fare, 0.0);
    }

    @Test
    public void givenMinimumDistanceAndTime_ShouldReturnMinimumFare() {
        double distance = 0.2;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }
}