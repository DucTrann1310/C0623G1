package org.example;

import until.ArrayUntils;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        ArrayUntils arrayUntils = new ArrayUntils();
        sw.start();

        int[] arr = arrayUntils.createArray(10000000,100,10);
        sw.stop();

        System.out.println("Sort trong vòng: " +sw.getElapsedTime() + " mili giây");
    }
}
