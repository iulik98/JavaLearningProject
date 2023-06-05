package com.iulifinttraining.exceptionsservicetask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataManager {
    public static String readDataFromFileWithoutTryCatch(String filepath) throws IOException {
        FileReader fileReader = new FileReader(filepath);
        BufferedReader reader = new BufferedReader(fileReader);
        String line;

        while ((line = reader.readLine())!=null) {
            System.out.println(line);
        }

        return reader.toString();
    }

    public static String readDataFromFileWithTryCatch(String filepath) {
        try {
            FileReader fileReader = new FileReader(filepath);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            while ((line = reader.readLine())!=null) {
                System.out.println(line);
            }

            return reader.toString();

        } catch (IOException e) {
            System.out.println("An error has occurred. Message: " + e.getMessage());
            e.printStackTrace();
        }
    return "";
    }
}
