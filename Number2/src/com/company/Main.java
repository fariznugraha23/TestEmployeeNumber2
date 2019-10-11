package com.company;

import java.util.*;

public class Main{
    public static void main(String args[]) {
        Integer[] array = { 1,12,5,111,200,1000,10 };
        String mainan="Mainan = ";
        int uang=30;
        for (int i = 0; i <array.length ; i++) {
            mainan+= array[i]+" ";
        }
        System.out.println(mainan);
        System.out.println("Uang = "+uang);
        Arrays.sort(array);
        int jumlah=0;
        Stack stack = new Stack();
        for (int i = 0; i <array.length ; i++) {
            jumlah=jumlah+array[i];
            if (jumlah<uang) {
                stack.push(jumlah);
            }
        }
        int count = stack.size();
        System.out.println("Jumlah mainan yang dapat di beli "+ count);
//        for (int i = 0; i < count ; i++) {
//        System.out.print(names[i]+" ");
//      }
    }
}