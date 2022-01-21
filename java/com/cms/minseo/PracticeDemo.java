package com.cms.minseo;

import java.util.Scanner;

public class PracticeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PracticeApp practiceApp = new PracticeApp();
        System.out.println(PracticeApp.web);
        System.out.println("성별");
        String 성별 = scanner.next();
        System.out.println("나이");
        int 나이 = scanner.nextInt();
        System.out.println("이름");
        String 이름 = scanner.next();
        String result = practiceApp.practice(성별, 나이, 이름);
        System.out.println(result);

    }

}
