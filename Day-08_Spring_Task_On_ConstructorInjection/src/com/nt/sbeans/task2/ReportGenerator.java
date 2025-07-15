package com.nt.sbeans.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
	private ReportService reportService;
	
	@Autowired
	public ReportGenerator(@Qualifier("pdfReportService") ReportService reportService) {
		this.reportService=reportService;
	}
	
	public void generateReport() {
		reportService.generateReport();
	}
	
}
