package com.maxicrop.spring;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.maxicrop.lottery.dao.UserDao;
import com.maxicrop.lottery.dao.UserDaoImpl;
import com.maxicrop.spring.beans.UserService;
import com.maxicrop.spring.beans.UserServiceImpl;

//@Configuration
//@ComponentScan(basePackages = { "com.maxicrop" })
//@EnableTransactionManagement
// @ImportResource({ "/WEB-INF/applicationContext.xml" })
public class AppConfig {

//	@Bean(name = "dataSource")
//	public DriverManagerDataSource dataSource() {
//
//		DriverManagerDataSource ds = new DriverManagerDataSource();
//		ds.setDriverClassName("com.mysql.jdbc.Driver");
//		ds.setUrl("jdbc:mysql://localhost:3306/maxi");
//		ds.setUsername("root");
//		ds.setPassword("password");
//		return ds;
//	}
//
//	@Bean
//	public SessionFactory sessionFactory() {
//		LocalSessionFactoryBean builder = new LocalSessionFactoryBean();
//		builder.setDataSource(dataSource());
//		builder.setHibernateProperties(getHibernateProperties());
//
//		return builder.getObject();
//	}
//
//	private Properties getHibernateProperties() {
//		Properties prop = new Properties();
//		prop.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//		prop.put("hibernate.show_sql", "true");
//		prop.put("hibernate.format_sql", "true");
//		prop.put("hibernate.use_sql_comments", "true");
//		prop.put("hibernate.hbm2ddl.auto", "update");
//		prop.put("hibernate.connection.CharSet", "utf8");
//		prop.put("hibernate.connection.characterEncoding", "utf8");
//		prop.put("hibernate.connection.useUnicode", "true");
//		return prop;
//	}
//
//	// Create a transaction manager
//	@Bean
//	public DataSourceTransactionManager txManager() {
//		DataSourceTransactionManager dst = new DataSourceTransactionManager();
//		dst.setDataSource(dataSource());
//		return dst;
//	}
//
//	@Bean
//	public UserService userService() {
//		return new UserServiceImpl();
//	}
//
//	@Bean
//	public UserDao userDao() {
//		UserDaoImpl userDao = new UserDaoImpl();
//		userDao.setSessionFactory(sessionFactory());
//		return userDao;
//	}

}
