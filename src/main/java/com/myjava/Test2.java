package com.myjava;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input = new Scanner(System.in);
        String str = input.nextLine();
        String[] tempStr = str.split("\\s+");//用空格将其分割成字符串数组

        int[] tempInt = new int[n];
        for (int i = 0; i < n; i ++) {
            tempInt[i] = Integer.valueOf(tempStr[i]);
        }

        int max = tempInt[0];
        for (int i = 1; i < n; i ++) {
            if (tempInt[i]>max){
                max = tempInt[i];
            }
        }

    }
}
