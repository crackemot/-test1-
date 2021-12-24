package com.company;

public class Main {
    public static void main(String []args) {
        int timer_s= (int) System.currentTimeMillis();
        for(int i = 0; i < 8000; i++) {
            System.out.println(255.234113*i);
            System.out.println(256.876383*i);
        }
        int timer_sum= (int) System.currentTimeMillis() - (int) timer_s;
        System.out.println(timer_sum);
    }
}
