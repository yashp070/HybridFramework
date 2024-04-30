package com.actitime.yash.genericutility;

import java.time.LocalDateTime;

public class javaUtilityA {

	public String timeStamp() {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}
}
