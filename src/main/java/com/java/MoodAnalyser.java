package com.java;

public class MoodAnalyser {
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
