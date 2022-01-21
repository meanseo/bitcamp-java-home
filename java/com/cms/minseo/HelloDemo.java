package com.cms.minseo;

import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        HelloApp helloApp = new HelloApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input ID: ");
        System.out.println("input PW: ");
        System.out.println("input NAME: ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        System.out.println("Output: ");
        String result = helloApp.hello(id, pw, name);
        System.out.println(result);
    }
}
