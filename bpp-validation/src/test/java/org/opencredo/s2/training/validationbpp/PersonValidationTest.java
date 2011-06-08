package org.opencredo.s2.training.validationbpp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonValidationTest {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void test1() {
		try {
			new ClassPathXmlApplicationContext("test1-context.xml", this.getClass());
			fail("Bean validation must fail");
		} catch (BeansException e) {
			logger.warn("Expected validation error", e);
		}
	}

	@Test
	public void test2() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("test2-context.xml", this.getClass());
		Person person = appCtx.getBean(Person.class);
		
		assertNotNull("Person bean not found", person);
	}
}
