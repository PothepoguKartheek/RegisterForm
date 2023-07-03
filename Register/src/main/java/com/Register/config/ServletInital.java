package com.Register.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ServletInital implements WebApplicationInitializer{


	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub

		
			AnnotationConfigWebApplicationContext config= new AnnotationConfigWebApplicationContext();
			
			config.register(AppConfig.class);
			// TODO Auto-generated method stub
			DispatcherServlet Servlet = new DispatcherServlet(config);
			
			Dynamic context=servletContext.addServlet("dispatcher", Servlet);
			context.addMapping("/");
			context.setLoadOnStartup(1);
		
	}
}
/*
 * View Ui(Logic)                 Controller RequestProcessing/    Service                    Repository
 *                                Navigation logic                 Bussiness Logic            Database Logic
 *                                                                 Validation logic
 *                                
 * html,css,js,Angular ,jQuery    Spring Web                       Ejb                        JDBC ,ORM
 *                                Servlet                          Java mail ,WebServiece      JPA ,Mango
 *                                Struts                           Rabbit Mq ,Kfka
 */
