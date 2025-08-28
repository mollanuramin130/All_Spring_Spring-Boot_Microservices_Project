package com.omni.dto;

import java.util.List;

import lombok.Data;

@Data
public class ResponseMessage {
	private Integer sourceCode;

	private String status;

	private String message;

	private Object data;

	private List<Object> list;



	public ResponseMessage(Integer sourceCode, String status, String message, Object data, List<Object> list) {
		super();
		this.sourceCode = sourceCode;
		this.status = status;
		this.message = message;
		this.data = data;
		this.list = list;
	}



	public ResponseMessage(Integer sourceCode, String status, String message, Object data) {
		super();
		this.sourceCode = sourceCode;
		this.status = status;
		this.message = message;
		this.data = data;
	}



}
