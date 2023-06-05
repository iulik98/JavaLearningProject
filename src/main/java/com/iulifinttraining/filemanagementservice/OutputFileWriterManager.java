package com.iulifinttraining.filemanagementservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFileWriterManager {

    public static void writeContentIntoFileUsingFileWriter(File file, String content,boolean append) {
        System.out.println("Trying to write into a file using FileWriter using write method");
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            if (append) {
                writer.append(content);
            } else writer.write(content + "\r\n");
        } catch (IOException e) {
            System.out.println("An exception has occured: " + e.getMessage());
        } finally {
            try {
                if (writer!=null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Exception has occurred while closing the fileWriter: " + e.getMessage());
            }
        }
    }

    public static void writeContentIntoFileUsingBufferedWriter(File file, String content,boolean append) {
        System.out.println("Trying to write into a file using BufferredWriter using write method");
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            writer = new FileWriter(file);
            bufferedWriter = new BufferedWriter(writer);
            if (append) {
                bufferedWriter.append(content).append("\r\n");
            } else bufferedWriter.write(content + "\r\n");
        } catch (IOException e) {
            System.out.println("An exception has occured: " + e.getMessage());
        } finally {
            try {
                if (writer!=null && bufferedWriter!=null) {
                    bufferedWriter.close();
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Exception has occurred while closing the bufferedWriter: " + e.getMessage());
            }
        }
    }
}
