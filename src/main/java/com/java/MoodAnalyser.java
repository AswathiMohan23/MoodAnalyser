package com.java;

public class MoodAnalyser {
    private String message;
    MoodAnalyser(){
    }

   /* public String MoodAnalyser() {
        return "Sad";
    }*/
    public String MoodAnalyser() {
        return "Happy";
    }


    public static String analyseTheMood(String mood) {
        if (mood == "Happy")
            return "Happy";
        else
            return "Sad";
    }
    public static String checkMood(String message){
        if(message.contains("Happy"))
            return "Happy";
        else
            return "Sad";
    }
    }
