package com.richard.demo04.directory;

import java.io.File;

public class DirectoryDeleteTest {

    public static void directoryDelete(File file) {

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            assert files != null;
            for (File tf : files) {
                directoryDelete(tf);
            }
        }
        file.delete();
    }

    public static void main(String[] args) {
        directoryDelete(new File("d:/b"));
    }
}
