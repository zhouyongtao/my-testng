package com.homeinns.web.testng;

import java.util.Random;

import org.testng.annotations.DataProvider;

public class GeneratorRandomNum {
	@DataProvider(name = "generate")
	public static Object[][] generate() {
		return new Object[][] { { new Random().toString() },
				{ new Random().toString() } };
	}
}