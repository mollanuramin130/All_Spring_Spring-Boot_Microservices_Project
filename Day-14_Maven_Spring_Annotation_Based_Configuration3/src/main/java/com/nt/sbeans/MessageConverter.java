package com.nt.sbeans;

import java.util.Map;

public class MessageConverter {
	private Map<String, IMessageConverter> map;
	
	public MessageConverter(Map<String, IMessageConverter> map) {
		this.map=map;
	}
	
	public String messageConverter(String type,String message) {
		IMessageConverter obj=map.get(type.toLowerCase());
		if(obj!=null) {
			return obj.convertTo(message);
		}else {
			return "Invalid converter type";
		}
	}
}
