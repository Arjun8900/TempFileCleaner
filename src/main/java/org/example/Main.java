package org.example;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide input file containing the temp folder list");
            return;
        }
        String inputFile = args[0];
        try {
            File input = new File(inputFile);
            List<String> folders = Files.readAllLines(input.toPath());
            System.out.println(folders);

            for (String folder: folders) {
                File file = new File(folder);
                File[] contents = file.listFiles();
                int deletedCount = 0;
                int totalCount = contents != null ? contents.length : 0;
                try {
                    if (contents != null) {
                        for (File content : contents) {
                            if (deleteDir(content)) {
                                deletedCount++;
                            }
                        }
                    }
                }
                catch (Exception e) {
                    System.out.println("Error in folder = " + folder);
                    e.printStackTrace();
                }
                System.out.printf("Deleted files from inside Folder = %s, Deleted = %s/%s, Remaining = %s %n", folder, deletedCount, totalCount, totalCount - deletedCount);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean deleteDir(File file) {
        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                deleteDir(f);
            }
        }
        return file.delete();
    }
}