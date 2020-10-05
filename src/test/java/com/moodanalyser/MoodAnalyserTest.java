package com.moodanalyser;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	
	@Test
	public void givenMessage_returnHappy_whenHappyMood()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser();
		assertEquals("Happy",moodanalyser.analyseMood("I am Happy"));
	}
	
	@Test
	public void givenMessage_returnSad_whenSadMood()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser();
		assertEquals("Sad",moodanalyser.analyseMood("I am Sad"));
	}
	
	@Test
	public void givenMessage_returnHappy_whenAnyMood()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser();
		assertEquals("Happy",moodanalyser.analyseMood("I am in Any Mood"));
	}
}


