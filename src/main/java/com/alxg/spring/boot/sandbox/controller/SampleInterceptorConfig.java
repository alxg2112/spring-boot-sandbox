package com.alxg.spring.boot.sandbox.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SampleInterceptorConfig implements WebMvcConfigurer {

	private final List<HandlerInterceptor> handlerInterceptors;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		handlerInterceptors.forEach(registry::addInterceptor);
	}
}
