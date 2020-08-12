package com.bridglabz;

public class MoodAnalyser {
    String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String AnalyseMood(String message) {
        if (message.contains("this is sad mood")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public String AnalyseMood() {
        return AnalyseMood(this.message);
    }
}
