package com.example.task02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Path> files = listFiles(Paths.get("task02/src/main/resources/"));
        files.forEach(file -> System.out.println(file.getFileName())); 
    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {
        List<Path> fileList = new ArrayList<>();
        Files Files = null;
        Files.walk(rootDir)
                .filter(java.nio.file.Files::isRegularFile)
                .forEach(fileList::add);
        return fileList;
    }
}
