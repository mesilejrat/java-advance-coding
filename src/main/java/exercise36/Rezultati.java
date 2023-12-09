package exercise36;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Rezultati {

    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private Lock readLock = readWriteLock.readLock();
    private Lock writeLock = readWriteLock.writeLock();


    private int[] results = new int[5];

    public void updateResult(int[] results) {
        writeLock.lock();
        try {
            this.results = results;
        } finally {
            writeLock.unlock();
        }
    }

    public int[] readResult() {
        readLock.lock();
        try {
            return results;
        } finally {
            readLock.unlock();
        }
    }
}