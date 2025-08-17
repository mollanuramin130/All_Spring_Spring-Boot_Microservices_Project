package com.nit.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Student {
	private int studentId;
	@NonNull
	private String studentName;
	@NonNull
	private String subject;
	@NonNull
	private double marks;
	
}
