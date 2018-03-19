package com.javaex.streamex.practice01_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {
    public static void main(String[] args) throws IOException {
        List<Person> list = new ArrayList<>();

        Reader reader = new FileReader("/Users/huxx_j/Downloads/phoneDB.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String str;

        while (true) {
            str = bufferedReader.readLine();
            if (str == null) {
                break;
            }
            String[] strArray = str.split(",");
            Person person = new Person(strArray[0],strArray[1],strArray[2]);
            list.add(person);
        }
        for (Person person : list) {
            System.out.println("이름 : " + person.getName());
            System.out.println("핸드폰 : " + person.getHp());
            System.out.println("회사 : " + person.getCompany());
            System.out.println();
        }
    }
}
