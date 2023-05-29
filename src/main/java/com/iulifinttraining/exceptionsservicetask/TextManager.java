package com.iulifinttraining.exceptionsservicetask;

public class TextManager {

    public static int getTextLength(String str) {
        return str.length();
    }

    public static int getTextLengthWithTryCatchFinally(String str) {
        try {
            return str.length();
        } catch (Exception e) {
            System.out.println("An exception has occurred" + e.getMessage());
            return 0;
        } finally {
            System.out.println("This block will be executed always.");
        }
    }

    public static int getTextLengthWithIfElse(String str){
        if (str==null){
            return 0;
        } else return str.length();
    }
}
