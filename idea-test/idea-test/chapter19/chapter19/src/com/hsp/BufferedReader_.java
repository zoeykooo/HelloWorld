package com.hsp;

public class BufferedReader_ extends Reader_{
    private  Reader_ reader_;
    public BufferedReader_(Reader_ reader_){
        this.reader_ =reader_;

    }
    public void readFiles(int num){
        for (int i =0;i<num; i++){
            reader_.readFile();
        }
    }
    public void readString(int num){
        for(int i =0;i<num;i++){
            reader_.readString();
        }
    }
}
