package com.advance.java3.Threading;

public class Main {
    public static void main(String[] args) {


        Runnnn runnnn = new Runnnn("Thread 1 ");
        Thread thread = new Thread(runnnn);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnnn runnnn1 = new Runnnn("Thread 2 ");
        Thread thread1 = new Thread(runnnn1);
        thread1.start();

        /*ThreadClass threadClass0 = new ThreadClass();
        threadClass0.start();

        ThreadClass threadClass1 = new ThreadClass();
        threadClass1.start();*/

        /*for(int i = 0 ; i <100;i++){
            System.out.println("For1 " +i);
        }*/

    }
}
