package com.richard.demo04.directory;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DirectoryCopyTest {


    private static void copy(File sourceFile, File destinationFile) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {

            bis = new BufferedInputStream(new FileInputStream(sourceFile));
            bos = new BufferedOutputStream(new FileOutputStream(destinationFile));

            System.out.println("正在玩命地拷贝" + sourceFile.getName() + "...");

            byte[] bArr = new byte[1024];
            int res = 0;
            while ((res= bis.read()) != -1) {
                bos.write(bArr, 0, res);
            }
            System.out.println("拷贝文件成功！");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != bos) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != bis) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void copyDirectoryThreadPool(File sourceDirectory, File destinationDirectory, ExecutorService executorService) {

        File[] files = sourceDirectory.listFiles();
        for (File file : files) {
            String absolutePath = file.getAbsolutePath();

            String destinationDirectoryPath = absolutePath.replace(file.getParent(), destinationDirectory + "");

            File tempFile = new File(destinationDirectoryPath);

            if (file.isDirectory()) {
                tempFile.mkdirs();
                copyDirectoryThreadPool(file, tempFile, executorService);
            } else if (file.isFile()){
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        tempFile.getParentFile().mkdirs();
                        copy(file, tempFile);
                    }
                });
            }

        }

    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        copyDirectoryThreadPool(new File("D:/a/"),new File("d:/b"), executorService);
        executorService.shutdown();

    }

}