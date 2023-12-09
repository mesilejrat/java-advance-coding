package exercise36;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Rezultati result = new Rezultati();

        executor.execute(new Sensor(result));
        executor.execute(new ScreenLog(result));

        executor.execute(new Sensor(result));
        executor.execute(new ScreenLog(result));

        executor.shutdown();
    }
}
