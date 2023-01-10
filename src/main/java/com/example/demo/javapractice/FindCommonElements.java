package com.example.demo.javapractice;

import java.util.HashSet;

public class FindCommonElements {

    private static void findCommonElement(String str1[], String str2[]) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for (String arr1 : str1) {
            set1.add(arr1);
        }
        for (String arr2 : str2) {
            set2.add(arr2);
        }
        set1.retainAll(set2);
        System.out.println("Common elements- " + set1);
    }


    public static void main(String[] args) {
        String str1[] = {"max", "ndfc", "as", "df"};
        String str2[] = {"max", "ty", "we", "bh"};
        findCommonElement(str1, str2);
    }
}
