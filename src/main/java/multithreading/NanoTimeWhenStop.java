package multithreading;

import org.apache.commons.lang3.time.StopWatch;

import java.util.ArrayList;
import java.util.List;

public class NanoTimeWhenStop {
    public static void main(String[] args) {
        final StopWatch started = StopWatch.createStarted();
        System.out.println();
        System.out.println(started.getTime());
    }
}
