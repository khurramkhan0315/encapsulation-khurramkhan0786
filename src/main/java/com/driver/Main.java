package com.driver;

public class Main {
  public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        //rw.name = "khurram"
        //'name' has private access in 'com. driver. RWOnly'
        rw.setId(123);
        rw.setName("khurram");
        System.out.println(rw.getId());
        System.out.println(rw.getName());
    }
}
