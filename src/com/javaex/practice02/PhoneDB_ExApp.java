package com.javaex.practice02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneDB_ExApp {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        List<PhoneDB_Ex> list = new ArrayList<>();
        Reader reader = new FileReader("/Users/huxx_j/Downloads/PhoneDB.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        PhoneDB_Ex phoneDB_ex = new PhoneDB_Ex();

        boolean run = true;

        String str;
        int remove = 0;

        Loop1:
        while (run) {
            while (true) {
                str = bufferedReader.readLine();
                if (str == null) {
                    break;
                } else {
                    String[] strArray = str.split(",");
                    PhoneDB_Ex phoneDB_ex2 = new PhoneDB_Ex(strArray[0], strArray[1], strArray[2]);
                    list.add(phoneDB_ex2);
                }
            }
            System.out.println("1. print | 2. add | 3. remove | 4. close");

            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i).toString());
                    }
                    continue;

                case 2:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("추가할 정보입력 > ");
                    str = scanner1.nextLine();
                    String[] addArray = str.split(",");
                    PhoneDB_Ex phoneDB_ex3 = new PhoneDB_Ex(addArray[0], addArray[1], addArray[2]);
                    list.add(phoneDB_ex3);

                    Writer writer = new FileWriter("/Users/huxx_j/Downloads/PhoneDB.txt");
                    BufferedWriter bufferedWriter = new BufferedWriter(writer);


                    for (PhoneDB_Ex aList : list) {
                        bufferedWriter.write(aList.printInfo());
                        bufferedWriter.flush();
                    }

                    continue;

                case 3:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("삭제할 인덱스 입력 > ");
                    remove = Integer.parseInt(scanner2.nextLine());
                    list.remove(remove);

                    Writer writer2 = new FileWriter("/Users/huxx_j/Downloads/PhoneDB.txt");
                    BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

                    for (PhoneDB_Ex aList : list) {
                        bufferedWriter2.write(aList.toString());
                        bufferedWriter2.newLine();
                        bufferedWriter2.flush();
                    }

                    continue;

                case 4:
                    System.out.println("프로그램 종료");

                    break;
            }
        }
    }
}
