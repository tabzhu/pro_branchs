package com.estar.branchs.config.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class EstarInterceptor implements HandlerInterceptor {

	private static Logger log = LoggerFactory.getLogger(EstarInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		log.info("---------------------开始进入请求地址拦截----------------------------");
		HttpSession session = arg0.getSession();
		if (!StringUtils.isEmpty((String)session.getAttribute("userName"))) {
			return true;
		} else {
			PrintWriter printWriter = arg1.getWriter();
			printWriter.write("{code:0,message:\"session is invalid,please login again!\"}");
			return false;
		}
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		log.info("--------------处理请求完成后视图渲染之前的处理操作---------------");
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		log.info("---------------视图渲染之后的操作-------------------------0");
	}

}
