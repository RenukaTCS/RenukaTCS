package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class StringOperationTest {

	StringOperation SO=new StringOperation();
	@Test
	public void testlength()
	{
		Assertions.assertEquals(7, SO.Stringlength());
	}
	
	@Test
	public void StringLtoU()
	{
		Assertions.assertEquals("WELCOME", SO.stringlowertoupper());
	}
	@Test
	public void StringUtoL()
	{
		Assertions.assertEquals("welcome", SO.stringuppertolower());
	}
	@Test
	public void StringConcat()
	{
		Assertions.assertEquals("Welcometo the devops",SO.stringConcat());
	}
	@Test
	public void StringTrim()
	{
		Assertions.assertEquals("Dev ops", SO.stringTrim());
	}
}

