package com.javaex.streamex.practice01;

import java.io.*;

public class PhoneDB {
    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("/Users/huxx_j/Downloads/phoneDB.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String name;
        String hp;
        String company;

        String str;

        while (true) {
            str = bufferedReader.readLine();
            System.out.println(str);
            if (str == null) {
                break;
            }

            String[] strings = str.split(",");

            name = strings[0];
            hp = strings[1];
            company = strings[2];

            System.out.println("이름 : " + name);
            System.out.println("핸드폰 : " + hp);
            System.out.println("회사 : " + company);
            System.out.println();
        }

        bufferedReader.close();
    }
}
