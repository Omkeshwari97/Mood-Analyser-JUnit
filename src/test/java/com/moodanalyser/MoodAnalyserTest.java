package com.moodanalyser;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.moodanalyser.MoodAnalyserException;

import org.junit.gen5.api.Assertions.*;

public class MoodAnalyserTest {
	
	@Test
	public void givenMessage_returnHappy_whenHappyMood()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in Happy Mood");
		
		try 
		{
			assertEquals("Happy", moodanalyser.analyseMood());
		} 
		catch (MoodAnalyserException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void givenMessage_returnSad_whenSadMood()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in Sad Mood");
		try 
		{
			assertEquals("Sad",moodanalyser.analyseMood());
		} 
		catch (MoodAnalyserException e) 
		{
			System.out.println(e.getMessage());
		}	
	}
	
	@Test
	public void givenMessage_returnHappy_whenAnyMood()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in No Mood");
		try 
		{
			assertEquals("Happy",moodanalyser.analyseMood());
		} 
		catch (MoodAnalyserException e) 
		{
			System.out.println(e.getMessage());
		}	
	}
	
	@Test
	public void givenMessage_throwMoodAnalysisException_whenNullMood()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser(null);
		MoodAnalyserException exception = assertThrows(MoodAnalyserException.class, () -> {moodanalyser.analyseMood();},"Invalid mood");
		assertEquals(exception.getType(), MoodAnalyserException.ExceptionType.ENTERED_NULL);
	}
	
	@Test
	public void givenMessage_throwMoodAnalysisException_whenEmptyMood()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser("");
		MoodAnalyserException exception = assertThrows(MoodAnalyserException.class, () -> {moodanalyser.analyseMood();},"Invalid mood");
		assertEquals(exception.getType(), MoodAnalyserException.ExceptionType.ENTERED_EMPTY);
	}
}


