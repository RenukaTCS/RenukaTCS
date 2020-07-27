package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
@ExtendWith(SpringExtension.class)
@SpringBootTest

public class AreaCalculatorTest {
	AreaCalculator a=new AreaCalculator();
@Test
public void testRect() {
	Assertions.assertEquals(120, a.rect());
}
@Test
public void testsquare()
{
	Assertions.assertEquals(4, a.square());
}
@Test
public void testcircle()
{
	Assertions.assertEquals(12.56, a.circle());
}
@Test
public void testTri()
{
	Assertions.assertEquals(4, a.tri());
}
@Test
public void testPara()
{
	Assertions.assertEquals(16, a.para());
}
}
