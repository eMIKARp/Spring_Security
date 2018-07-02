package pl.springsecurity;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import pl.springsecurity.security.SecurityConfig;
import pl.springsecurity.web.WebConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {SecurityConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
