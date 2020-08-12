package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void GivenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("this is sad mood");
        String mood = moodAnalyser.AnalyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void GivenHappyMessage_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("this is Happy mood");
        String mood = moodAnalyser.AnalyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

}
