package com.hsp.api.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接...");
       Socket socket = serverSocket.accept();
      // System.out.println("score ="+ socket.getClass());
        System.out.println("服务器 socket="+socket.getClass());
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s=bufferedReader.readLine();
        System.out.println(s);

        // byte[] buf =new byte[1024];
        //int readLen = 0;
        //while((readLen =inputStream.read(buf)) != -1){
          //  System.out.println(new String(buf,0,readLen));

            OutputStream outputStream = socket.getOutputStream();
            //outputStream.write("hello,client".getBytes());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello client 字符流");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        socket.shutdownOutput();

            bufferedWriter.close();
            bufferedReader.close();
            socket.close();

        }


    }

