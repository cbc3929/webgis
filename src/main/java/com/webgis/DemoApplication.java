package com.webgis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		boolean i ;
		String zipfile = "d:/work/testedp";
		String extractDir = "d:/work/abc";
		i=new Javadll().sCompressFile(zipfile,extractDir);
		boolean j = new Javadll().sUnCompressFile(zipfile,extractDir);
	}
}

