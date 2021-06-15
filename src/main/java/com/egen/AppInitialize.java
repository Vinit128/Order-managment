package com.egen;

//import com.sun.istack.internal.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitialize extends AbstractAnnotationConfigDispatcherServletInitializer{

  // @Nullable
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {AppConfig.class};

	}
   // @Nullable
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[0];
	}
    
	@Override
	protected String[] getServletMappings() {
		return new  String[]{"/api/*"};
	}
}
