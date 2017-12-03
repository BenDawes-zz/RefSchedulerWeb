package com.refscheduler.refschedulerweb;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.refscheduler.refschedulerweb.web.SpringWebConfig;

public class RefSchedulerWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	public static final String CHARACTER_ENCODING = "UTF-8";


	public RefSchedulerWebApplicationInitializer() {
		super();
	}


	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { SpringWebConfig.class };
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { SpringWebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() {
		final CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding(CHARACTER_ENCODING);
		encodingFilter.setForceEncoding(true);
		return new Filter[] { encodingFilter };
	}

}