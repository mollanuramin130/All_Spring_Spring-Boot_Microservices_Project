package com.nt.sbeans.task2;

import org.springframework.stereotype.Component;

@Component
public class PdfReportService implements ReportService {

	@Override
	public void generateReport() {
		System.out.println("Report Generated Throung PDF..");

	}

}
