package com.example.company;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void ShouldReturnTrue() {

        Assert.assertTrue(true);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnExceptionWhenGetANegativeNumber(){
        int inputNumber =-1;
        App.fizzBuzz(inputNumber);
    }

    @Test
    public void shouldGetAFizzBuzzWhenNumber15() {

        int inputNumber = 20;
        List<String> result = App.fizzBuzz(inputNumber);
        Assert.assertEquals("FizzBuzz",result.get(14));
    }

    @Test
    public void shouldGet4WhenNumberPosition3() {

        int inputNumber = 20;
        List<String> result = App.fizzBuzz(inputNumber);
        Assert.assertEquals("4",result.get(3));
    }

    @Test
    public void shouldGetBuzzWhenNumberPosition4() {

        int inputNumber = 20;
        List<String> result = App.fizzBuzz(inputNumber);
        Assert.assertEquals("Buzz",result.get(4));
    }

    @Test
    public void shouldGetFizzWhenNumberPosition2() {

        int inputNumber = 20;
        List<String> result = App.fizzBuzz(inputNumber);
        Assert.assertEquals("Fizz",result.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldLimit() {
        int inputNumber = 101;
        App.fizzBuzz(inputNumber);
    }
    @Test(expected = IllegalArgumentException.class)
    public void should() {
        int inputNumber = 0;
        App.fizzBuzz(inputNumber);
    }


}
