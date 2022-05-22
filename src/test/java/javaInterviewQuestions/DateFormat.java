package javaInterviewQuestions;

import java.text.SimpleDateFormat;

public class DateFormat {

	public static void main(String[] args) {

		String pattern = "MM-dd-yy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new java.util.Date());
		System.out.println(date); // 06-23-2020

	}

}
