package com.cms.minseo;

public class PracticeApp {
    public static String web = "* Welcome *";
    private String 성별;
    private int 나이;
    private String 이름;

    public String practice(String param성별, int param나이, String param이름){
        성별 = param성별;
        나이 = param나이;
        이름 = param이름;
        return "안녕하세요. " + 성별 + " 사람 " + 나이 + "세 " + 이름 + " 님";
    }
}
