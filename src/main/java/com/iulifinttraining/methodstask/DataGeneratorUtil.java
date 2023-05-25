package com.iulifinttraining.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    private final static Random random = new Random();

    public static int generateRandomInt(int min, int max) {
        if (min >= max) {
            System.out.println("Valoarea minima trebuie sa fie mai mica decat valoarea maxima");
            return 0;
        }
        int delta = max - min;
        int deltaRandom = random.nextInt(delta);
        return deltaRandom + min;
    }

    public static int generateRandomInt(int max) {
        return random.nextInt(max);
    }

    public static double generateRandomDouble(double limit) {
        if (limit < 0) {
            System.out.println("Limita trebuie sa fie pozitiva");
            return 0;
        }
        return random.nextDouble() * 100;
    }

    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }

    public static String generateRandomEmail(String domain) {
        String uuid = UUID.randomUUID().toString();
        return uuid + domain;
    }

    public static String generateInvalidRandomString(int length) {
        String acceptedChars = "~!@#$%^&*()_+-/";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = generateRandomInt(0, acceptedChars.length());
            sb.append(acceptedChars.charAt(randomIndex));
            //  System.out.println("In iteratia i: " + i + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return sb.toString();
    }

    public static String generateValidRandomString(int length) {
        String acceptedChars = "ABCDEFGHIJKLMNOPRSTUVQWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = generateRandomInt(0, acceptedChars.length());
            sb.append(acceptedChars.charAt(randomIndex));
            //   System.out.println("In iteratia i: " + i + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return sb.toString();
    }


}