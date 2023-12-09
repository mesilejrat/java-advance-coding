package exercise34;

public class Exercise34 extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Exercise34 thread = new Exercise34();
        Exercise34 thread1 = new Exercise34();
        Exercise34 thread2 = new Exercise34();
        Exercise34 thread3 = new Exercise34();
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
