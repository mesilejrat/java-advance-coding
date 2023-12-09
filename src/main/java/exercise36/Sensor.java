package exercise36;

import java.util.Random;
import java.util.stream.IntStream;

public class Sensor implements Runnable {

    private Rezultati result;

    public Sensor(Rezultati result) {
        this.result = result;
    }

    @Override
    public void run() {
        while (true) {
            int sleepTime = new Random().nextInt(500);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println("Execution Interrupted");
            }
            int[] values = result.readResult();
            values = IntStream.of(values).map(value -> value + new Random().nextInt(10)).toArray();
            result.updateResult(values);
        }
    }
}