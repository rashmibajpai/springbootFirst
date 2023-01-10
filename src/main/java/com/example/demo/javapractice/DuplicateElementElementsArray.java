package com.example.demo.javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateElementElementsArray {
    public static void main(String[] args) {

        String str[] = {"Rashmi", "Rashmi", "Parul", "Pranjali", "Niki", "Parul"};

        HashSet<String> set = new HashSet<>();
        for (String str1 : str) {
 /*   if(!set.add(str1))
    {
        System.out.println("elements" +":"+str1);
    }*/

            if (set.contains(str1)) {
                System.out.println("elements" + ":" + str1);
            } else {
                set.add(str1);
            }
        }


    }
}
