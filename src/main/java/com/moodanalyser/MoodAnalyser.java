package com.moodanalyser;

public class MoodAnalyser {
	
	public String analyseMood(String message)
	{
		if(message.contains("Happy"))
		{
			return "Happy";
		}
		else
		{
			return "Sad";
		}
	}

}
