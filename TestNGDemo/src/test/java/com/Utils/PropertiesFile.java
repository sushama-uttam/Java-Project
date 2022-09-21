package com.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class PropertiesFile {
	public static Properties loadProperty(String path) throws IOException{
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}
	public static PrintStream response(String path) throws FileNotFoundException {
		PrintStream printStream = new PrintStream(new FileOutputStream(path));
		return printStream;
	}
}
