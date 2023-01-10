package com.example.demo.javapractice;

public class ReverseString {
    public static void main(String[] args) {

        //with builtin Function
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("Reverse"+ ":"+ sb.reverse());

// without builtin Function
        String str= "India";
        char ch[]= str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev= rev+ch[i];
        }
        System.out.print("Reverse string without using builtin function"+": "+ rev);
    }

}
