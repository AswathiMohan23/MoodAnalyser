package com.java;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MoodAnalyserTest {
    @Test
    public void analyse_Mood_And_Respond(){
        assertEquals("Sad", MoodAnalyser.analyseTheMood("Sad"));
        assertEquals("Happy", MoodAnalyser.analyseTheMood("Happy"));
    }
}
