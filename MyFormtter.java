package com.technoelevtelogger;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormtter extends Formatter {

	@Override
	public String format(LogRecord record) {
		return record.getMessage()+":"+record.getLevel()+":"+record.getClass()+"\n";
	}

}
