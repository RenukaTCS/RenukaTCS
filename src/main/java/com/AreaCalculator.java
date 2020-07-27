package com;

import org.springframework.web.bind.annotation.GetMapping;

public class AreaCalculator {

	@GetMapping("/reactangle")
	public int rect()
	{
		return 10*12;
	}
	@GetMapping("/square")
	public int square()
	{
		return 2*2;
	}
	@GetMapping("/Circle")
	public double circle()
	{
		double pi=3.14;
		return pi * 2 * 2;
	}
	@GetMapping("/triangle")
	public int tri()
	{
		return (2* 4)/2;
	}
	@GetMapping("/Prallelogram")
	public int para()
	{
		return 4*4;
	}
}
