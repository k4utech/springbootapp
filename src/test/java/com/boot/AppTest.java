package com.boot;

import org.junit.Test;

import com.boot.controller.HomeController;

import static org.junit.Assert.*;

public class AppTest{

	@Test
	public void testApp(){
        HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals(result,"Hello World!");
    }
}
