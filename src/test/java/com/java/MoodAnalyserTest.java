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
    //In case of NULL or Empty Mood throw Custom Exception MoodAnalysisException.Use Enum to differentiate the Mood analysis Errors
    @Test
    public void given_Invalid_Mood_Should_Inform_The_User() throws MoodAnalyserException{
        try{
            MoodAnalyser.invalidMoodAnalyser("null") ;
        }catch (MoodAnalyserException exception){
            System.out.println(MoodAnalyserEnum.INVALID_MOOD);
        }
    }

    //To pass this Test Case in try catch block throw MoodAnalysisException

    @Test
    public void given_Null_Mood_Should_Throw_MoodAnalyserException() throws MoodAnalyserException{
        try{
            MoodAnalyser.invalidMoodAnalyser("null") ;
        }catch (MoodAnalyserException exception){
            System.out.println(MoodAnalyserEnum.NULL);
        }
    }

    //Handle Empty Mood Scenario throw MoodAnalysisException and inform user of the EmptyMood .HINT: Use Enum to EMPTY or NULL

    @Test
    public void given_Empty_Mood_Should_Throw_MoodAnalyserException_Indicating_EmptyMood() throws MoodAnalyserException{
        try{
            MoodAnalyser.EmptyMoodAnalyser("Empty") ;
        }catch (MoodAnalyserException exception){
            System.out.println(MoodAnalyserEnum.EMPTY_MOOD+" ======>>>TC 3.2 ");
        }
    }
}
