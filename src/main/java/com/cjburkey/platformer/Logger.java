package com.cjburkey.platformer;

import java.util.Calendar;

public final class Logger {
	
	private static final String PRE = "[";
	private static final String BET = ":";
	private static final String POST = "] ";
	
	public static void log(Object msg) {
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		StringBuilder out = new StringBuilder(PRE);
		out.append(hour);
		out.append(BET);
		out.append(min);
		out.append(BET);
		out.append(sec);
		out.append(POST);
		out.append(msg);
		System.out.println(out.toString());
	}
	
}