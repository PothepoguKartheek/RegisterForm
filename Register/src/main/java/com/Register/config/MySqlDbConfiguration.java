package com.Register.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.mysql.cj.xdevapi.SessionFactory;


@Configuration
public class MySqlDbConfiguration {
	
	@Bean
	public static Properties getConnectionProperties() {
		
		Properties properties=new Properties();
		
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		return properties;
	}
	
	@Bean
	public DataSource getDataSource() {
		
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ailen");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		
		LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
		bean.setDataSource(getDataSource());
		bean.setHibernateProperties(getConnectionProperties());
		bean.setPackagesToScan("com.Register.Entity");
		return bean;
	}
}
