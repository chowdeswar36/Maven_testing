package com.cg.maven.testing;

import org.testng.annotations.Test;

public class Pass_Command_Parameters {
	@Test
	public void getparameter() {
		System.out.println(System.getProperty("username") + "--------------" + System.getProperty("password"));
	}

}
