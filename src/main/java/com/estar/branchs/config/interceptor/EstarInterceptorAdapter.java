package com.estar.branchs.config.interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class EstarInterceptorAdapter extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//注册自定义拦截器，添加拦截路径和排除拦截路径    
        registry.addInterceptor(new EstarInterceptor()).addPathPatterns("api/path/**");    
	}

}
