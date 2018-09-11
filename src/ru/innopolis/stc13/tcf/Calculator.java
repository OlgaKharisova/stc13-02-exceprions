package ru.innopolis.stc13.tcf;

public class Calculator {
    public double divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("exception");
        } finally {
            System.out.println("finally");
        }
        return 1;
    }
}
