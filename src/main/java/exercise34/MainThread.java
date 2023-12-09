package exercise34;

public class MainThread {
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
