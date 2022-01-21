package com.cms.minseo;

public class CalcApp {
    public static String web  = "calc.com";
    private int num1;
    private int num2;
    private String opcode;

    public String calc(int no1, String op, int no2){
        num1 = no1;
        num2 = no2;
        opcode = op;
        int num3 = num1 + num2;
        return num1 + " " + opcode + " " + num2 + " = " + num3;
    }
}
