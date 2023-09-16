package com.hsp.outputstream_;

import java.io.*;
import java.util.concurrent.Callable;

public class BufferedCopy02 {
    public static void main(String[] args) throws IOException {
        String scrFilePath ="c:\\hazel.jpg";
        String destFilePath ="c:\\hzm.jpg";
        BufferedInputStream bis =null;
        BufferedOutputStream bos =null;
        try {
            bis =new BufferedInputStream(new FileInputStream(scrFilePath));
            bos =new BufferedOutputStream(new FileOutputStream(destFilePath));
            byte[]buff =new byte[1024];
            int readLen =0;
            while ((readLen = bis.read(buff))!= -1) {
                bos.write(buff,0,readLen);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

                if(bis != null){
                bis.close();
            }
                if(bos !=null) {
                    bos.close();
                }
            }
                }
        }
















