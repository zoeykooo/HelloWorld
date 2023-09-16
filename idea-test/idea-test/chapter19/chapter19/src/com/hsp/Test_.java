package com.hsp;

public class Test_ {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFiles(10);
        BufferedReader_ bufferedReader2_ = new BufferedReader_(new StringReader_());
        bufferedReader2_.readString(5);
    }
}
