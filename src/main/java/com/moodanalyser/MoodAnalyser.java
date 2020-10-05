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
		try 
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
		catch (NullPointerException e) 
		{
			return "Happy";
		}
	}

}
