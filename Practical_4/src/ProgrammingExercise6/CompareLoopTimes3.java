package ProgrammingExercise6;
import java.time.*;

public class CompareLoopTimes3 {
    public static void main(String[] args) {
        int startTime, endTime;
        int startSecond, endSecond;
        final int REPEAT = 100000;
        final int FACTOR = 1000000;
        final int NANOS_IN_SEC = 1000000000;
        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano();
        startSecond = now.getSecond();
        for(int x = 0; x <= REPEAT; ++x)
            for(int y = 0; y <= REPEAT; ++y);
        now = LocalDateTime.now();
        endTime = now.getNano();
        endSecond = now.getSecond();

        if(startSecond != endSecond)
            endTime = endTime + NANOS_IN_SEC;
        System.out.println("Time for loops starting from 0: " +
                ((endTime - startTime) / FACTOR) + " milliseconds");
        now = LocalDateTime.now();
        startTime = now.getNano();
        startSecond = now.getSecond();
        for(int x = REPEAT; x >= 0; --x)
            for(int y = REPEAT; y >= 0; --y);
        now = LocalDateTime.now();
        endTime = now.getNano();
        endSecond = now.getSecond();

        if(startSecond != endSecond)
            endTime = endTime + NANOS_IN_SEC;
        System.out.println("Time for loops ending with 0: " +
                ((endTime - startTime) / FACTOR) + " milliseconds");
    }
}
