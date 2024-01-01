package com.kk.usercenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class UserCenterApplicationTests {

	@Test
	void regexTest() {
		String userAccount = "jlsiefj3#";
		String validPattern = "[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]";
		Pattern regex = Pattern.compile(validPattern);
		Matcher matcher = regex.matcher(userAccount);
		if (matcher.find()) {
			System.out.println(true);
		}
	}

	@Test
	void contextLoads() {
	}

}
