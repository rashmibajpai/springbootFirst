package com.example.demo.javapractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Emp {
    private  final String name;
    private final int id;
    private final Map<String, String> empmap;

    private  final Address address;

    public Emp(String name, int id, Map<String, String> empmap,Address address) {
        this.name = name;
        this.id = id;
        Map<String, String> tempMap = new HashMap<>();
      for(Map.Entry<String ,String>entry : empmap.entrySet()){
          tempMap.put(entry.getKey(),entry.getValue());
      }
      this.empmap =empmap;

      this.address=address;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Map<String, String> getEmpmap() {
        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String, String> entry :
                this.empmap.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getZip());
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", empmap=" + empmap +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        // Adding elements to Map object
        // using put() method
        map.put("1", "first");
        map.put("2", "second");


        Address ad =  new Address("LUCK","3456");
      Emp emp = new Emp("Parul",23,map,ad) ;
    //  emp.name = "rashmi";  not allowed to modify

        //System.out.println(emp.getName());
        //System.out.println(emp.getId());
       // System.out.println(emp.getEmpmap());
        //System.out.println(emp.getAddress());
        emp.getAddress().setCity("Pune");


       // map.put("3","three");

       System.out.println(emp);


    }
}
