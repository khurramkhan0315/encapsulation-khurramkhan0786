package com.driver;

public class Main {
   public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        rw.setId(123);  //due to private method its create an error
        rw.setName("khurram");
        System.out.println(rw.getId());
        System.out.println(rw.getName());
      }
}
