package ru.pflb.study;

public class Main {
    public static void main(String[] args) {
        System.out.println("111");
    }
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int divide(int a, int b){
        if (b==0) {
            throw new RuntimeException("Div by 0");
        }
        return a/b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
}
