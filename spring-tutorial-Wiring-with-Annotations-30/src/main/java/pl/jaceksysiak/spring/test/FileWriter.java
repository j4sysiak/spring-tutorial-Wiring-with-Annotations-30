package pl.jaceksysiak.spring.test;

import org.springframework.beans.factory.annotation.Qualifier;

public class FileWriter implements LogWriter{

	public void write(String text) {
		 
		System.out.println("Write to file: " + text);
	}

}
