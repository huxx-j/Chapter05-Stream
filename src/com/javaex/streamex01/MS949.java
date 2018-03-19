package com.javaex.streamex01;

import java.io.*;

public class MS949 {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("/Users/huxx_j/Downloads/MS949.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "MS949");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String str;
        while (true) {
            str = bufferedReader.readLine();
            if (str == null) {
                break;
            }
            System.out.println(str);
        }

        bufferedReader.close();



    }
}
