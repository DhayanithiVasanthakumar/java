package com.java.methods.find_small_number;

public class Number {
	public static int smallest(int x, int y, int z){
        return Math.min(Math.min(x, y), z);
    }
}
