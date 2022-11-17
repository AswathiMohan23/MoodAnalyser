package com.java;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MoodAnalyserTest {
    static MoodAnalyser moodAnalyser=new MoodAnalyser();

    @Test
    public void analyse_Mood_And_Respond(){
        assertEquals("Happy", MoodAnalyser.analyseTheMood("Happy"));
        assertEquals("Sad", MoodAnalyser.analyseTheMood("Sad"));

    }
    @Test
    public void analyse_Mood_Return_Mood(){
        assertEquals("Happy", MoodAnalyser.checkMood("I am Happy"));
        assertEquals("Sad", MoodAnalyser.checkMood("I am Sad"));
    }

    //To pass this Test Case when calling analyseMood method with no params should return SAD

   /* @Test
    public void given_I_am_In_Sad_Mood_Message_In_Constructor_Return_Sad(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.MoodAnalyser();
        assertEquals("Sad",mood);
    }*/
    //To pass this Test Case when calling analyseMood method with no params should return HAPPY
    @Test
    public void given_I_am_In_Happy_Mood_Message_In_Constructor_Return_Happy(){
        String mood=moodAnalyser.MoodAnalyser();
        assertEquals("Happy",mood);
    }
    @Test
    public void handle_Exception_If_User_Provides_Invalid_Mood() throws MoodAnalyserException{
        try{
            MoodAnalyser.invalidMoodAnalyser("null") ;
        }catch (MoodAnalyserException exception){
            System.out.println("Invalid mood ====> UC2");
        }
    }
    //To make this Test Case pass Handle NULL Scenario using try catch and return Happy
    @Test
    public void given_Null_Mood_Should_Return_Happy() throws MoodAnalyserException{
        try{
            MoodAnalyser.invalidMoodAnalyser("null") ;
        }catch (MoodAnalyserException exception){
            System.out.println("Happy ===> TC 2.1");
        }
    }
}
