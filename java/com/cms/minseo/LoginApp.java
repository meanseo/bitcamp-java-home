package com.cms.minseo;

public class LoginApp {
    public static String website = "=== Naver ===";
    String id;
    String pw;
    String name;

    public String login(String paramId, String paramPw, String paraName){
        id = paramId;
        pw = paramPw;
        name = paraName;
        return "ID " + id + " PW " + pw + " NAME " + name;
    }
}
