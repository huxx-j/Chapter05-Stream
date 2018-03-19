package com.javaex.streamex01;

import java.io.*;

public class ByteStreamApp {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("/Users/huxx_j/Downloads/img.jpg");
        OutputStream out = new FileOutputStream("/Users/huxx_j/Downloads/img11.jpg");
        int bData;
        byte[] buff = new byte[1024];

        System.out.println("복사시작");

        while (true) {
            bData = in.read(buff);

            if (bData == -1) {
                System.out.println("복사가 완료되었습니다." + bData);
                break;
            }
            out.write(bData);
        }
        in.close();
        out.close();
    }
}
