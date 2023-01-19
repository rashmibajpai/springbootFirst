package com.example.demo.javapractice;

public class DoubleCheckingLazySingleton {

    static DoubleCheckingLazySingleton instance;

    private DoubleCheckingLazySingleton(){

    }

    public static DoubleCheckingLazySingleton getInstance()
    {
      if(instance==null) {
          synchronized (DoubleCheckingLazySingleton.class) {
              instance = new DoubleCheckingLazySingleton();
          }
      }

        return instance;
    }
}
