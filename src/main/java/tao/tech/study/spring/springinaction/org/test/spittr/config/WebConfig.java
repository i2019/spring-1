package tao.tech.study.spring.springinaction.org.test.spittr.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("tao.tech.study.spring.springinaction.org.test.spittr.web")  
public class WebConfig extends WebMvcConfigurerAdapter{
	
	// Tiles
	  @Bean
	  public TilesConfigurer tilesConfigurer() {
	    TilesConfigurer tiles = new TilesConfigurer();
	    tiles.setDefinitions(new String[] {
	        "/WEB-INF/layout/tiles.xml",
	        "/WEB-INF/views/**/tiles.xml"
	    });
	    tiles.setCheckRefresh(true);
	    return tiles;
	  }
	  
	@Bean
	public ViewResolver viewResolver() {
	    return new TilesViewResolver();
	}
	  
	/*
	 * 配置JSP视图解析器  
	 */
	/*
	@Bean  
    public ViewResolver viewResolver() { 
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();  
        resolver.setPrefix("/WEB-INF/views/");  
        resolver.setSuffix(".jsp");  
        resolver.setExposeContextBeansAsAttributes(true); //可以在JSP页面中通过${}访问beans  
        return resolver;  
    }  
  	*/
	
	/*
	 * 配置静态文件处理  
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
	 */
    @Override  
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {  
        configurer.enable(); 
    }  
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
      // TODO Auto-generated method stub
      super.addResourceHandlers(registry);
    }
    
    @Bean
    public MessageSource messageSource() {
      ReloadableResourceBundleMessageSource messageSource = 
          new ReloadableResourceBundleMessageSource();
      messageSource.setBasename("file:///Users/habuma/messages");
      messageSource.setCacheSeconds(10);
      return messageSource;
    }
}
