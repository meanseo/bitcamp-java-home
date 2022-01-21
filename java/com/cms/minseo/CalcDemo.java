package com.cms.minseo;

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();
        System.out.println(CalcApp.web);
        System.out.println("첫번째 숫자");
        System.out.println("연산기호");
        System.out.println("두번째 숫자");
        int num1 = scanner.nextInt();
        String opcode = scanner.next();
        int num2 = scanner.nextInt();
        System.out.println("결과");
        String result = calcApp.calc(num1, opcode, num2);
        System.out.println(result);
    }
}
