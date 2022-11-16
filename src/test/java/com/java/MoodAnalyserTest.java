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
}
