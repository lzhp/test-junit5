package org.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class Test1 {

	@Tag("tttt fast")
	@Test
	void test() {
		assertTrue(1 == 1);
	}

	@Test
	void test2() {
		assertTrue(2 == 2);
	}

}
