package com.reservation.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.reservation.dao.UserDao;
import com.reservation.dao.UserDaoImpl;
import com.reservation.service.UserService;
import com.reservation.service.UserServiceImpl;

@SuppressWarnings("deprecation")
@Configuration
@ComponentScan(basePackages = "")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	
	@Bean(name = "UserService")
    public UserService getEtudiantService() {
        return (UserService) new UserServiceImpl();
    }
	@Bean(name = "UserDao")
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(31556926);
		registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(31556926);
		registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(31556926);
		registry.addResourceHandler("/**").addResourceLocations("/").setCachePeriod(31556926);
	}


}
