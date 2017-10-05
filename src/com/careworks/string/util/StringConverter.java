package com.careworks.string.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringConverter {
	
	public static int  convertLettersToNumbers (String input) {
		int result = -1;
		if (input!=null && input.trim().length()!=0&& input.matches("[a-zA-Z]+")) {
			input = input.trim();
			String smallLetters = "abcdefghijklmnopqrstuvwxyz";
			String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String regEx = "^[A-Z]+$";
			int position;
			StringBuilder sb = new StringBuilder();
	        Pattern pattern = Pattern.compile(regEx);
	        for (int i=0;i<input.length();i++) {
	        	Matcher matcher = pattern.matcher(""+input.charAt(i));
	            if (matcher.find()) {
	         	   position = capitalLetters.indexOf(input.charAt(i));
	         	  position = (position+1)*2;
	         	  
	            }else {
	            	position = smallLetters.indexOf(input.charAt(i));
	            	position++;
	            }
	            sb.append(position);
	        }
	        result = Integer.valueOf(sb.toString());
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		  System.out.println(convertLettersToNumbers("Az"));
	}

}
