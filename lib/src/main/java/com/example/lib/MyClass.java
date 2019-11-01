package com.example.lib;

import java.util.Arrays;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入3個數");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int []ar = new int [3];
        ar[0] = x;
        ar[1] = y;
        ar[2] = z;
        Arrays.sort(ar);

        for(int a :ar){
            System.out.println(a);
        }

    }

}
