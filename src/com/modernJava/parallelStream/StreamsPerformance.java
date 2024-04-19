package com.modernJava.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamsPerformance {
    public static void main(String[] args) {
        int loop = 20;
        long result = measurePerformances(StreamsPerformance::streamSum, loop);
        System.out.println("stream performance time: " + result + " milli Seconds");
        result = measurePerformances(StreamsPerformance::parallelStreamSum, loop);
        System.out.println("Parallel Stream performance time: " + result + " milli Seconds");
    }

    public static long measurePerformances(Supplier<Integer> supplier, int num) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            supplier.get();
        }
        return System.currentTimeMillis() - startTime;
    }

    public static int streamSum() {
        return IntStream.rangeClosed(0, 500000).sum();
    }

    public static int parallelStreamSum() {
        return IntStream.rangeClosed(0, 500000).parallel().sum();
    }
}
