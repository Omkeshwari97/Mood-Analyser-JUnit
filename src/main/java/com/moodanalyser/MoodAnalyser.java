package com.moodanalyser;

public class MoodAnalyser {
	
	private String message;
	
	public MoodAnalyser()
	{
	}
	
	public MoodAnalyser(String message) 
	{
		this.message=message;
	}
	
	public String analyseMood()
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
