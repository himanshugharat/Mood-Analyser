package com.bridglabz;

public class MoodAnalyser {
    String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String AnalyseMood(String message) {
        try {
            if (message.contains("this is sad mood")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("HAPPY");
        }

    }

    public String AnalyseMood() {
        return AnalyseMood(this.message);
    }
}
