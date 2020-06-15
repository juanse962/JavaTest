package com.example.javatest.discounts;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void total_zero_when_there_are_prices()
    {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_the_sum_of_price()
    {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addPrice(10.0);
        priceCalculator.addPrice(15.0);

        assertThat(priceCalculator.getTotal(), is(25.0));
    }

    @Test
    public void apply_discount_to_price()
    {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addPrice(12.5);
        priceCalculator.addPrice(17.5);

        priceCalculator.setDiscount(25);
        assertThat(priceCalculator.getTotal(), is(22.5));
    }
}