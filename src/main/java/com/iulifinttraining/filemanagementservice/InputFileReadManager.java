package com.iulifinttraining.filemanagementservice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class InputFileReadManager {
    public static void readTextWithFiles(File file) {
        System.out.println("\r\nTrying to read the content from the file using Files class, readString method");
        try {
            System.out.println(Files.readString(Path.of(file.getAbsolutePath())));
        } catch (IOException e) {
            System.out.println("There is an exception: " + e.getMessage());
        }
    }

    public static void readTextWithBufferedReader(File file) {
        System.out.println("\r\nTrying to read the content from the file using BufferedReader class, readLine method");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine())!=null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("There is an exception: " + e.getMessage());
        } finally {
            try {
                if (fileReader!=null && bufferedReader!=null) {
                    fileReader.close();
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Exception while closing fileReader: " + e.getMessage());
            }
        }
    }

    public static void readTextWithFileReader(File file) {
        System.out.println("\r\nTrying to read the content from the file using FileReader class, read method");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int ch;
            while ((ch = fileReader.read())!=-1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("There is an exception: " + e.getMessage());
        } finally {
            try {
                if (fileReader!=null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println("Exception while closing fileReader: " + e.getMessage());
            }
        }
    }

    public static void readTextWithScanner(File file) {
        System.out.println("\r\nTrying to read the content from the file using Scanner class, nextLine method");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("There is an exception: " + e.getMessage());
        } finally {
            if (scanner!=null) {
                scanner.close();
            }
        }
    }
}
