package com.exception;

public class Test {

	int a = 10;
	int b = 0;

	public static void main(String[] args) {
		Test test = new Test();
		test.test();

	}

	public void test() {
		try {
			if (a == 20 && a / b == 0) {// It will not throw exception because before throwing exception it will come our from if block as execution will go from left to right and in very first condition it will fail.
				System.out.println("IF BLOCK");
			} else {
				System.out.println("ELSE BLOCK");      
			}
		} catch (ArithmeticException ae) {
			System.out.println("AE EXE");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("EXE");
		}

	}

}
