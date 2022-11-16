package com.java;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void analyse_Mood_And_Respond(){
        TestCase.assertEquals("sad", MoodAnalyser.analyseTheMood("sad"));
    }
}
