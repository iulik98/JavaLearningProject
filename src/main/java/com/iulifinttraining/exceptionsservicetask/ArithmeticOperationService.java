package com.iulifinttraining.exceptionsservicetask;

public class ArithmeticOperationService {

    public static int divideIntNoExceptionHandling(int a, int b) {
        return a / b;
    }

    public static int divideIntWithExceptionHandling(int a, int b) {

        try {
            return a / b;
        } catch (ArithmeticException capturedException) {
            System.out.println("An exception has occurred" + capturedException.getMessage());
            return 0;
        }
    }
}
