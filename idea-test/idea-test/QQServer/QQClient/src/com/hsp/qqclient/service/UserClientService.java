package com.hsp.qqclient.service;

import com.hsp.common.User;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class UserClientService {
    private User u = new User();
    private Socket socket;

    public boolean checkUser(String userID,String pwd) {
        u.setUserID(userID);
        u.setPasswd(pwd);

        try {
            socket=new Socket(InetAddress.getByName("gomakoo"),9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    }
}
