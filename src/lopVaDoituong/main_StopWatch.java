package lopVaDoituong;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class main_StopWatch {
    public static void main(String[] args) {
        long[] array = new long[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.floor(Math.random()*1000));
        }
        StopWatch stopWatch1 = new StopWatch();
        stopWatch1.star();
        Arrays.sort(array);
        stopWatch1.stops();
        System.out.println(stopWatch1.getElapsedTime());

    }
}
