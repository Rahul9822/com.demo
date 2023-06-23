package com.trial;

import java.util.Properties;

import org.hibernate.cfg.Environment;

public class HibernateProgrammaticMetaDataMain {

	public static void main(String[] args) {
		Properties hibernateProperties=new Properties();
		hibernateProperties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		hibernateProperties.put(Environment.URL, "jdbc:mysql://localhost:3306/db1?useSSL=false");
		hibernateProperties.put(Environment.USER, "root");
		hibernateProperties.put(Environment.PASS, "root");
		hibernateProperties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		hibernateProperties.put(Environment.SHOW_SQL, "true");
		hibernateProperties.put(Environment.HBM2DDL_AUTO, "update");
		

	}

}
