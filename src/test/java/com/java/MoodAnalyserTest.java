package com.java;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MoodAnalyserTest {
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
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.MoodAnalyser();
        assertEquals("Happy",mood);
    }
}
