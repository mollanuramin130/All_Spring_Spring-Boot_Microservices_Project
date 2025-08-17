package com.nit.model;

import java.time.LocalDate;
import java.util.Date;

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
	private String email;
	@NonNull
	private String course;
	@NonNull
	private LocalDate registrationDate;
}
