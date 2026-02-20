package org.example;

import java.util.Scanner;

public class SensorRunner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sum = 0;
        Sensor array[] = new Sensor[5];
        for(int i = 0; i < 5; i++){
            String location = input.next();
            double readers = input.nextDouble();
            array[i] = new Sensor(location, readers);
            sum += array[i].getReading();
        }
        System.out.println(sum/5);
    }
}
