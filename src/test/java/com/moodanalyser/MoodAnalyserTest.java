package com.moodanalyser;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
	
	@Test
	public void givenMessage_returnHappy_whenHappy()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser();
		assertEquals("Happy",moodanalyser.analyseMood("I am Happy"));
	}
	
	@Test
	public void givenMessage_returnSad_whenSad()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser();
		assertEquals("Sad",moodanalyser.analyseMood("She is Sad"));
	}
}


