package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number %2 ==0){
            System.out.println("number is even");
        }else {
            System.out.println("odd");
        }
    }
}
