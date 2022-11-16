package com.java;

public class MoodAnalyser {
    private String message;
    MoodAnalyser(){
    }

    public static void invalidMoodAnalyser(String message) {
        try{
            message.equals("sad");
            }catch (Exception e){
                System.out.println("e");
        }

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
