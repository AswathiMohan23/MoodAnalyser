package com.java;

public class MoodAnalyser {
    private String message;
    MoodAnalyser(){
    }

    public static void invalidMoodAnalyser(String message) throws MoodAnalyserException {
        if(message.equals("null"))
            throw new MoodAnalyserException();
    }
    public static void EmptyMoodAnalyser(String message) throws MoodAnalyserException {
        if(message.equals("Empty"))
            throw new MoodAnalyserException();
    }
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
