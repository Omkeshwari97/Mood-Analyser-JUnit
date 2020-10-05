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
	
	public String analyseMood() throws MoodAnalyserException
	{
		try 
		{
			if(message.length()==0)
			{
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"Empty mood");
			}
			else if(message.contains("Sad"))
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
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Null mood");
		}
	}

}
