package com.slack.utils;

public class PayLoadUtils {
    public static String getSlackMessagePayLoad(String message, String channel){
return "{\n" +
        "    \"channel\": \""+channel+"\",\n" +
        "    \"text\": \""+message+"\"\n" +
        "}";




    }
}
