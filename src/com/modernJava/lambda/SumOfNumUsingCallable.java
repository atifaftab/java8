package com.modernJava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumUsingCallable {
    public static int[] array = IntStream.rangeClosed(0, 5000).toArray();
    public static int total = IntStream.rangeClosed(0, 5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable callable = () -> {
            int sum = 0;
            for (int i = 0; i < array.length / 2; i++) {
                sum += array[i];
            }
            return sum;
        };
        Callable callable1 = () -> IntStream.range(array.length/2, array.length ).sum();
//        {
//            int sum = 0;
//            for (int i = array.length / 2; i < array.length; i++) {
//                sum += array[i];
//            }
//            return sum;

//        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable, callable1);
        List<Future<Integer>> futures = executorService.invokeAll(taskList);

        int k = 0;
        int sum = 0;
        for (Future<Integer> result : futures) {
            sum += result.get();
            System.out.println("sum of " + ++k + " is " + result.get());
        }
        System.out.println("sum of callable is " + sum);
        System.out.println("correct sum from IntStream is " + total);
        executorService.shutdown();


    }
}
