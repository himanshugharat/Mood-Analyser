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
            if (message.contains("sad")) {
                return "SAD";
            }else if (message.equals("")){
                throw new MoodAnalyserException(ExceptionClass.EmptyException.getException());
            }
            else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(ExceptionClass.NullException.getException());
        }
    }

    public String AnalyseMood() {
        return AnalyseMood(this.message);
    }
}
