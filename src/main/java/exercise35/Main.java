package exercise35;

public class Main {
    public static void main(String[] args) {
        Exercise35 exercise35 = new Exercise35();
        Thread thread = new Thread(exercise35);
        Thread thread1 = new Thread(exercise35);
        Thread thread2 = new Thread(exercise35);
        thread.start();

        thread1.start();
        thread2.start();
    }
}
