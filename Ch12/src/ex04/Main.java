package ex04;

public class Main {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Thread Name : " + mainThread.getName());

        ThreadA threadA = new ThreadA("Hi");
        System.out.println("Thread Name : " + threadA.getName());
    }
}
