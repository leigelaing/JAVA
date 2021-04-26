package com.demo01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class text01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw =
                new BufferedWriter(new FileWriter("F:\\Javayunama\\leigeliang\\2021.4.25(JAVA)\\a.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("大声道");
            bw.write("\r\n");
        }
        bw.flush();
        bw.close();
    }
}
