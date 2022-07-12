package com.board.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/* spring 5.3 version 이상에서는 HandlerInterceptorAdapter 를 사용하는 대신
 * HandlerInterceptor를 implements 해서 사용하는 방식으로 바뀌었다고 한다 */
public class LoggerInterceptor implements HandlerInterceptor{

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.debug("===============================================");
		logger.debug("==================== BEGIN ====================");
		logger.debug("Request URI ===> " + request.getRequestURI());
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.debug("==================== END ======================");
		logger.debug("===============================================");
	}

}
