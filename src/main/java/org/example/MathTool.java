package org.example;

public class MathTool {
    private long n;
    public long factorialRecursive(long n) {
        if(n <= 1) return 1;
        else return n * factorialRecursive(n-1);
    }
    public long  factorialIterative(long n){
        long sum = 1;
        for(int i = 2; i <= n; i++){
            sum *= i;
        }
        return sum;
    }


}
