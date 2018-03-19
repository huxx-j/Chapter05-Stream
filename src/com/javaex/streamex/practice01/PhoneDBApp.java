package com.javaex.streamex.practice01;

import java.io.*;

public class PhoneDBApp {
    public static void main(String[] args) throws IOException, NullPointerException {

        InputStreamReader reader = new FileReader("/Users/huxx_j/Downloads/phoneDB.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String name;
        String hp;
        String company;

        while (bufferedReader.read() != -1) {

            try {
                String[] strlist = bufferedReader.readLine().split(",");
//                if (bufferedReader.readLine() == null) {
//                    break;
//                } else {
                    name = strlist[0];
                    hp = strlist[1];
                    company = strlist[2];

                    System.out.println("이름 : " + name);
                    System.out.println("핸드폰 : " + hp);
                    System.out.println("회사 : " + company);
                    System.out.println();
//                }
            } catch (NullPointerException | IOException e) {
                break;
            }
        }
        bufferedReader.close();
    }
}
