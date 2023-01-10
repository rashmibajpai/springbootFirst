package com.example.demo.javapractice;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElement {
    public static void main(String[] args) {

        String str1[] = {"one","two","gh","max"};
        String str2[] = {"uui","rt","gyui","max"};

        System.out.println("Array 1: "+ Arrays.toString(str1));
        System.out.println("Array 2: "+ Arrays.toString(str2));

        System.out.print("Common Elements: ");

        findCommonElement(str1, str2);

    }

    private static void findCommonElement(String str1[],String str2[]){

        HashSet<String>set = new HashSet<>();

        for(int i= 0;i<str1.length; i++){
            for(int j=0;j<str2.length;j++)
            {
                if(str1[i]==str2[j])
                {
                    set.add(str1[i]);
                    break;
                }
            }
        }
        for (String comman:set){
            System.out.println(comman+ ":");
        }

    }
}
