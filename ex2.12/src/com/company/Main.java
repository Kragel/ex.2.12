package com.company;

public class Main {

    public static void main(String[] args) {
        int h = -1;
        System.out.println(Integer.toBinaryString(h));
        h <<= 10;
        System.out.println(Integer.toBinaryString(h));
        for(int i = 0; i < 32; i++)
        {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}