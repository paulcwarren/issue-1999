package com.example.issue_1999;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Issue1999ApplicationTests {

	@Autowired
	private SampleRepository repo;

	@Autowired
	private SampleContentStore store;

	@Test
	void contextLoads() {
	}

}
