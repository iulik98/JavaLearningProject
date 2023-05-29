package com.iulifinttraining.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int result = ArithmeticOperationService.divideIntNoExceptionHandling(10, 7);
        System.out.println(result);
        int result1 = ArithmeticOperationService.divideIntWithExceptionHandling(10, 0);
        System.out.println(result1);
        String st = "StringValueText";
        System.out.println("NoExceptionHandling: The length of the string is: " + TextManager.getTextLength(st));
        System.out.println("ExceptionHandling: The length of the string is: " + TextManager.getTextLengthWithTryCatchFinally(null));
        System.out.println("ExceptionHandling: The length of the string is: " + TextManager.getTextLengthWithIfElse(null));

        String file = "src/main/java/com/iulifinttraining/exceptionsservicetask/test.txt";
        try {
            ReadDataManager.readDataFromFileWithoutTryCatch(file);
        } catch (IOException e) {
            System.out.println("The file does not exist. The execution is not stopped.");
        }

        System.out.println("The program is executed.");

        ReadDataManager.readDataFromFileWithTryCatch(file);
    }
}
