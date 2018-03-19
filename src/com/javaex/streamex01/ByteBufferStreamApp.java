package com.javaex.streamex01;

import java.io.*;

public class ByteBufferStreamApp {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("/Users/huxx_j/Downloads/img.jpg");
        BufferedInputStream bIn = new BufferedInputStream(in);

        OutputStream out = new FileOutputStream("/Users/huxx_j/Downloads/img12.jpg");
        BufferedOutputStream bOut = new BufferedOutputStream(out);

        int bData;
        System.out.println("복사 시작");
        while (true) {

            bData = bIn.read();
            if ( bData == -1 ) {
                System.out.println("복사완료" + bData);
                break;
            }
            bOut.write(bData);
        }

        bIn.close();
        bOut.close();
    }
}
