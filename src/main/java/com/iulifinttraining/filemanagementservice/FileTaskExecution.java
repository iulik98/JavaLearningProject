package com.iulifinttraining.filemanagementservice;

import java.io.File;

public class FileTaskExecution {

    public static void main(String[] args) {
        String path = "src/main/java/com/iulifinttraining/filemanagementservice/File1.txt";
        File demoFile = new File(path);
        FileManager.createTheFileThatDoesNotExist(demoFile);
        FileManager.createTheFileThatDoesNotExist(new File("src/main/java/com/iulifinttraining/filemanagementservice/File2.txt"));
        FileManager.informIfTheFileExists(demoFile);
        FileManager.printIfTheFileIsADirectory(demoFile);
        FileManager.printTheFileName(demoFile);
        FileManager.printTheFileAbsolutePath(demoFile);
        FileManager.deleteTheFileIfExists(demoFile);

        File readFile = new File("src/main/java/com/iulifinttraining/filemanagementservice/readFile.txt");
        InputFileReadManager.readTextWithFiles(readFile);
        InputFileReadManager.readTextWithFileReader(readFile);
        InputFileReadManager.readTextWithBufferedReader(readFile);
        InputFileReadManager.readTextWithScanner(readFile);

        File writeFile = new File("src/main/java/com/iulifinttraining/filemanagementservice/writeFile.txt");
        OutputFileWriterManager.writeContentIntoFileUsingFileWriter(writeFile,"Content 1",false);
        OutputFileWriterManager.writeContentIntoFileUsingFileWriter(writeFile,"\r\nContent 2",true);
        File writeFileBuff = new File("src/main/java/com/iulifinttraining/filemanagementservice/writeFileBufferedWriter.txt");
        OutputFileWriterManager.writeContentIntoFileUsingBufferedWriter(writeFileBuff,"Content 3",false);
        OutputFileWriterManager.writeContentIntoFileUsingBufferedWriter(writeFileBuff,"\r\nContent 4",true);

    }
}
