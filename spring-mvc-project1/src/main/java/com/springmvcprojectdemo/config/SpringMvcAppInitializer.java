package com.springmvcprojectdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		@SuppressWarnings("rawtypes")
		Class[] arr= {SpringMvcConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String[] arr= {"/mymodelwebsite.com/*"};
		return arr;
	}

}
