package com.java.methods.middle;

public class Middle {

	public static String middle( String str) {
		int position;
		int length;
		//for even
		if(str.length()%2==0) {
			position=str.length()/2-1;
			length=2;
		}
		//for odd
		else {
			position=str.length()/2;
			length=1;
		}
		return str.substring(position, position+length);
	
		
	}
}
