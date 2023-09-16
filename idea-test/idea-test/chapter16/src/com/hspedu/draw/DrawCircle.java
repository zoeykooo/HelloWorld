package com.hspedu.draw;

import javax.swing.*;
import java.awt.*;


@SuppressWarnings({"all"})
public class DrawCircle extends JFrame {

    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序~");
    }

    public DrawCircle() {

        mp = new MyPanel();

        this.add(mp);

        this.setSize(400, 300);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}


class MyPanel extends JPanel {



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint 方法被调用了~");

        g.setColor(Color.red);
        g.setFont(new Font("隶书", Font.BOLD, 50));

        g.drawString("北京你好", 100, 100);



    }
}
