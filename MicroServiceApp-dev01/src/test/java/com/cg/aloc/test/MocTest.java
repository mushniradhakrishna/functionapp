package com.cg.aloc.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.aloc.controller.DemoController;

@RunWith(SpringRunner.class)

public class MocTest {

	@InjectMocks
	DemoController demoController;

	@Test
	public void getApi() {
		demoController.getApi();
		//assertNotNull(demoController.getApi(),"Hello World");
	}
	
	@Test
	public void getResultTest()
	{
		demoController.getResult();
	}

}