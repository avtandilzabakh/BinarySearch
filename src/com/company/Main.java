package com.company;

public class Main {

    public static void main(String[] args) {
        BinarySearch.index(2,1,2,3,4,5,6).ifPresentOrElse(System.out::println,()-> System.out.println("none"));


    }
}