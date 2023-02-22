package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void runs() {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.runs();
		cat.feeds();
		assertEquals(cat.isAlive(), true);
		assertEquals(cat.howHungry(), 30);
	}
	
	@Test
	public void eating() {
		Cat cat = new Cat();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 0);
		assertEquals(cat.isAlive(), true);
	}
	
	@Test
	public void feedsrun() {
		Cat cat = new Cat();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		cat.runs();
		cat.runs();
		cat.feeds();
		cat.runs();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 70);
	}
	
	@Test
	public void feeds() {
		Cat cat = new Cat();
		for (int i = 0; i < 18; i++) {
			cat.runs();
		}
		assertEquals(cat.isAlive(), false);
	}
}