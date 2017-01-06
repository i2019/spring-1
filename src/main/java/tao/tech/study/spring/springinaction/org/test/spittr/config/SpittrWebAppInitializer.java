package tao.tech.study.spring.springinaction.org.test.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * 通过AbstractAnnotationConfigDispatcherServlet-Initializer来配置DispatcherServlet是传统web.xml方式的替代方案。
 * 如果愿意的话，可以同时包含web.xml和AbstractAnnotationConfigDispatcher-ServletInitializer，但这其实并没有必要。
 * 如果按照这种方式配置DispatcherServlet，而不是使用web.xml的话，那唯一问题在于它只能部署到支持Servlet 3.0的服务器中才能正常工作，如Tomcat 7或更高版本。
 */
public class SpittrWebAppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getRootConfigClasses() { // 根容器
		return new Class<?>[] { RootConfig.class };
	}

	/*
	 * getServletConfigClasses()方法中，
	 * 要求DispatcherServlet加载应用上下文时，使用定义在WebConfig配置类（使用Java配置）中的bean。
	 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses()
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() { 
		return new Class<?>[] { WebConfig.class };
	}

	/*
	 	 * getServletMappings()，
	 * 它会将一个或多个路径映射到DispatcherServlet上。
	 * 映射的是“/”，这表示它会是应用的默认Servlet。它会处理进入应用的所有请求。
	 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletMappings()
	 */
	@Override
	protected String[] getServletMappings() { 
		return new String[] { "/" };
	}
}
