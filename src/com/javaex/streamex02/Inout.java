package com.javaex.streamex02;

import java.io.*;

public class Inout {
    public static void main(String[] args) throws IOException {

        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();

        Writer writer = new OutputStreamWriter(System.out);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        writer.write(line);

        bufferedReader.close();
        bufferedWriter.close();
//        System.out.println(line);
    }
}
