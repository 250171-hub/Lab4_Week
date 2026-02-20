package org.example;

public class MathToolRunner {
    public static void main(String[] args){
        MathTool mathTool = new MathTool();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for(int i = 0; i < 1000000; i++){
            mathTool.factorialRecursive(20);
        }

        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime());

        stopWatch.start();

        for(int i = 0; i < 1000000; i++){
            mathTool.factorialIterative(20);
        }

        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime());


    }
}
