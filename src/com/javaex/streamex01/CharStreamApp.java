package com.javaex.streamex01;

import java.io.*;

public class CharStreamApp {
    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("/Users/huxx_j/Downloads/song.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String str;

        while (true) {
            str = bufferedReader.readLine();
            if (str == null) {
                break;
            }
            System.out.println(str);
        }
        bufferedReader.close();


//        Writer fw = new FileWriter("/Users/huxx_j/Downloads/song.txt");
//        BufferedWriter bFw = new BufferedWriter(fw);
//
//        bFw.write("학교종이 땡땡땡");
//        bFw.newLine();
//        bFw.write("어서모이자");
//        bFw.newLine();
//        bFw.write("선생님이 우리를");
//        bFw.newLine();
//        bFw.write("기다리신다.");
//
//
//        bFw.close();

    }
}
