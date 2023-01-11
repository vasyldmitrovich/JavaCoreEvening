package com.softserve.edu11.MyProjects.PracticalTask1;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

//        Text.printCheckText();
//        Text.printName();



		//String text = "";
		//
		String pattern ="[A-Za-z]+";
//		String pattern ="(ab)+";
//		String pattern ="(\\w)\\1"; // Java String: \\ -> \
//		String pattern = "\\b\\w*([\\w])\\1\\w*\\b";
		String text = "Sitko Roman Igorovych";
		//

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		// 1. Is correspond
		if (m.matches()) {
			System.out.println("m.matches() OK");
		} else {
			System.out.println("m.matches() FALSE");
		}
		// 2. Get all parts
		m.reset(); // Reset Iterator

        String s1, s2, s3;
		while (m.find()) {
		    s1 = text.substring(m.start(), m.end());
//			System.out.print(" *" + text.substring(m.start(), m.end()) + "* ");
		}



    }
}
