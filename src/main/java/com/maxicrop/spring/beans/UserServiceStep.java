package com.maxicrop.spring.beans;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class UserServiceStep {

	private int x;

//	@Given("a variable x with value $value")
	@Aliases(values={"a variable x with value $value"})
	public void givenXValue(@Named("value") int value) {
		x = value;
	}

	@When("I multiply x by $value")
	public void whenImultiplyXBy(@Named("value") int value) {
		x = x * value;
	}

	@Then("x should equal $value")
	public void thenXshouldBe(@Named("value") int value) {
		if (value != x)
			throw new RuntimeException("x is " + x + ", but should be " + value);
	}
}
