package com.tenco.bank.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TimestampUtil {
	
	public static String timestampToString(Timestamp timestamp) {

		// 문자열 포맷
		// yyyy-mm-dd HH:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		
		return sdf.format(timestamp);
	}

}
