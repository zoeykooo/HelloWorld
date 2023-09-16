package com.hsp.api.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回=" + socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(
                                                            new OutputStreamWriter( outputStream));



       bufferedWriter.write("hello,server 字符流");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        InputStream inputStream = socket.getInputStream();
        //byte[] buf = new byte[1024];
        //int readLen = 0;
        //while ((readLen = inputStream.read(buf)) != -1) {
          //  System.out.println(new String(buf, 0, readLen));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        bufferedReader.close();
           outputStream.close();
            socket.close();
            System.out.println("客户端退出。。");

            System.out.println("客户端退出。。。");


        }
    }

