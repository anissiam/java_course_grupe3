package com.advance.java3.Threading;

public class Runnnn implements Runnable{
    private String name;

    public Runnnn(String name) {
        this.name = name;
    }

    @Override
    public void run() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
