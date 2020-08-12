package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void GivenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.AnalyseMood("this is sad mood");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void GivenHappyMessage_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.AnalyseMood("this is Happy mood");
        Assert.assertEquals("HAPPY", mood);
    }

}
