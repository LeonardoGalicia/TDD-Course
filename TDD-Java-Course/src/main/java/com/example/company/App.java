package com.example.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


    public static List<String> fizzBuzz(int inputNumber) {
        if(inputNumber<=0 || inputNumber >100){
            throw new IllegalArgumentException("no puede ser menor a cero ni mayor a 100");
        }
        return IntStream.rangeClosed(1, inputNumber)
                .mapToObj(i -> i % 5 == 0 ? (i % 3 == 0 ? "FizzBuzz" : "Buzz") : (i % 3 == 0 ? "Fizz" : i+""))
                .collect(Collectors.toList());
    }
}
