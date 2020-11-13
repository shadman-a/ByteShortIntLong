package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
		int myMaxIntValueTest = 2_147_483_647;
	    System.out.println("Integer Minimum Value =" + myMinIntValue);
        System.out.println("Integer Maximum Value =" + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;

		System.out.println(myMaxByteValue);
		System.out.println(myMinByteValue);

		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;

		System.out.println(myMaxShortValue);
		System.out.println(myMinShortValue);
		
		long myLongValue = 100L;

		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;

		System.out.println(myMaxLongValue);
		System.out.println(myMinLongValue);
		
		byte myNewByteValue = (byte) (myMinByteValue / 2);
	}
}