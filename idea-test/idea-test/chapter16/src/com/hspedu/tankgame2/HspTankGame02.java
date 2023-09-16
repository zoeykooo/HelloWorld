package com.hspedu.tankgame2;

import javax.swing.*;


public class HspTankGame02 extends JFrame {


    MyPanel mp = null;
    public static void main(String[] args) {

        HspTankGame02 hspTankGame01 = new HspTankGame02();
    }

    public HspTankGame02() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
