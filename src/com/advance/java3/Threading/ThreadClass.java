package com.advance.java3.Threading;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println(getName());
        for(int i = 0 ; i <10;i++){
            try {
                System.out.println(i);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
