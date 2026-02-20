package org.example;

public class StepCounterRunner {
    public static void main(String[] args){
        StepCounter userA = new StepCounter();
        StepCounter userB = new StepCounter();
        userB.walk(100);
        userA.walk(210);
        System.out.println(userA.getIndividualSteps());
        System.out.println(StepCounter.getTotalStepsAllUsers());
        StepCounter.resetGlobalSteps();
        System.out.println(StepCounter.getTotalStepsAllUsers());
    }
}
