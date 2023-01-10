package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class ListEven {

    public static void main(String[] args) {

       List<Integer> list = Arrays.asList(56,13,34,2,4,5);

       list.stream().filter(n->n%2!=0).forEach(System.out::println);





    }
}
