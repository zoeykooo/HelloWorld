package com.hsp.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端，在8888端口监听，等待连接...");
        Socket socket = serverSocket.accept();
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes =StreamUtils.streamToByteArray(bis);
        String destFilePath ="src\\hazel2.jpg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);

        bos.close();

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到图片");
        writer.flush();
        socket.shutdownOutput();



        bis.close();
        socket.close();
        serverSocket.close();


    }
}
