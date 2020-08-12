package com.bridglabz;

public class MoodAnalyser {
        public String AnalyseMood(String message){
            if (message.contains("this is sad mood")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
}
