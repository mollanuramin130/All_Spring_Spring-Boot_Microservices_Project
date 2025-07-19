package com.nt.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.sbeans.HtmlMessageConverter;
import com.nt.sbeans.IMessageConverter;
import com.nt.sbeans.MessageConverter;
import com.nt.sbeans.PdfMessageConverter;

@Configuration
public class AppConfig {
	@Bean("html")
	public IMessageConverter assignHtmlMessageConverter() {
		return new HtmlMessageConverter();
	}
	
	@Bean("pdf")
	public IMessageConverter assignPdfMessageConverter() {
		return new PdfMessageConverter();
	}
	
	@Bean("map")
	public Map<String, IMessageConverter> assignMap(){
		return new HashMap<>();
	}
	
	@Bean("messageConverter")
	public MessageConverter assignMessageConverter() {
		
		Map<String, IMessageConverter> map=new HashMap<String, IMessageConverter>();
		map.put("html",assignHtmlMessageConverter());
		map.put("pdf",assignPdfMessageConverter());
		
		return new MessageConverter(map);
	}
}
