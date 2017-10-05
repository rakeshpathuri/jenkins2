package com.careworks.string.util.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.careworks.string.util.StringConverter;

public class StringConverterTest {
	
	@Test
	public void testResultForValidInput() {
		assertEquals(126, StringConverter.convertLettersToNumbers("az"));
		assertEquals(123, StringConverter.convertLettersToNumbers("abc"));
		assertEquals(326, StringConverter.convertLettersToNumbers("cz"));
		assertEquals(14340, StringConverter.convertLettersToNumbers("aBcT"));
	}
	@Test
	public void testResultForInvalidValidInput() {
		assertEquals(-1, StringConverter.convertLettersToNumbers("A#123"));
		assertEquals(-1, StringConverter.convertLettersToNumbers(" AZ "));
		assertEquals(-1, StringConverter.convertLettersToNumbers(null));
		assertEquals(-1, StringConverter.convertLettersToNumbers(""));
	}
	
	

}
