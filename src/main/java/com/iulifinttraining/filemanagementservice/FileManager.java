package com.iulifinttraining.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static void createTheFileThatDoesNotExist(File file) {
        if (file.exists()) {
            System.out.println("The file already exists.");
        } else {
            System.out.println("The file does not exists, it has to be created.");
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("There is an exception: " + e.getMessage());
            }
        }

    }

    public static void informIfTheFileExists(File file) {
        if (file.exists()) {
            System.out.println("The file exists.");
        } else System.out.println("The file does not exists.");
    }

    public static void printTheFileName(File file) {
        if (file!=null) {
            System.out.println("The file name is: " + file.getName());
        }
    }

    public static void printTheFileAbsolutePath(File file) {

        if (file!=null) {
            System.out.println("The file absolute path is: " + file.getAbsolutePath());
        }
    }

    public static void printIfTheFileIsADirectory(File file) {
        if (file!=null) {
            if (file.isDirectory()) {
                System.out.println("The file is a directory.");
            } else System.out.println("This is not a directory.");

        }
    }

    public static void deleteTheFileIfExists(File file){
        if (file != null) {
            if (file.exists()){
                if (file.delete()){
                    System.out.println("The file is deleted.");
                } else System.out.println("The file is not deleted.");
            } else System.out.println("The file does not exists.");
        }
    }
}


