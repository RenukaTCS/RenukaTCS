package com;

import org.springframework.web.bind.annotation.GetMapping;

public class StringOperation {

	@GetMapping
	public int Stringlength()
	{
		String S="Welcome";
				
		return S.length();
	}
	@GetMapping
	public String stringReplace()
	{
		String S1="hello how are you";
			
		return S1.replace("hello", "Devops");
	}
	@GetMapping
	public String stringlowertoupper()
	{
		String S2="welcome";
		return S2.toUpperCase();
	}
	
	@GetMapping
	public String stringuppertolower()
	{
		String S3="WELCOME";
		return S3.toLowerCase();
	}
	@GetMapping
	public String stringConcat()
	{
		String S4="Welcome";
		String S5="to the devops";
		return S4.concat(S5);
	}
	@GetMapping
	public String stringTrim()
	{
		String S8="Dev ops";
		return S8.trim();
	}
}

