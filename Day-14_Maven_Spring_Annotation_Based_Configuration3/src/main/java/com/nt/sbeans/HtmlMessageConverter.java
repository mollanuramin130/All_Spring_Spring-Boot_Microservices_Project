package com.nt.sbeans;

public class HtmlMessageConverter implements IMessageConverter {

	@Override
	public String convertTo(String message) {

		return "<html>"+message+"</html>";
	}

}
