package com.moodanalyser;

public class MoodAnalyser {
	
	public String analyseMood(String message)
	{
		if(message.contains("Sad"))
		{
			return "Sad";
		}
		else
		{
			return "Happy";
		}
	}

}
