package com.moodanalyser;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	
	@Test
	public void givenMessage_returnHappy_whenHappyMood()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser("I am Happy");
		assertEquals("Happy",moodanalyser.analyseMood());
	}
	
	@Test
	public void givenMessage_returnSad_whenSadMood()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in Sad Mood");
		assertEquals("Sad",moodanalyser.analyseMood());
	}
	
	@Test
	public void givenMessage_returnHappy_whenAnyMood()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in Any Mood");
		assertEquals("Happy",moodanalyser.analyseMood());
	}
}


