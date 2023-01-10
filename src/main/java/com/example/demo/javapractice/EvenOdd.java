package com.example.demo.javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Write a program to print even and odd number
public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = {34, 6, 89, 2, 12, 11, 23, 12, 16, 17};

        List<Integer> evenNum = new ArrayList<>();
        List<Integer> oddNum = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenNum.add(num);
                //System.out.println(num);

            } else {
                oddNum.add(num);
            }

        }

        System.out.println("array of even number" + evenNum);
        System.out.println("array of even number" + oddNum);
    }
}
