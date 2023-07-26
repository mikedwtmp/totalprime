package org.example;
import java.lang.Math;
import java.util.LinkedList;

public class Main {

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt((double)n); ++i) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean isTotalPrime(int n) {
        if(!isPrime(n)) {
            return false;
        }
        int currentNo;
        while(n > 0) {
            currentNo = n % 10;
            if(!isPrime(currentNo)) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    public static LinkedList<Integer> getTotalPrimes(int start, int end) {
        LinkedList<Integer> totalPrimes = new LinkedList<Integer>();
        for (int i = start; i <=end; ++i) {
            if(isTotalPrime(i)) {
                totalPrimes.add(i);
            }
        }
        return totalPrimes;
    }
    public static void main(String[] args) {
        LinkedList<Integer> test = getTotalPrimes(500, 600);
        for (int i : test) {
            System.out.println(i);
        }
    }
}