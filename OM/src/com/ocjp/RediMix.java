/**
 * 
 */
package com.ocjp;

/**
 * @author Amit Jha
 * 
 */
//Constructor chaining csr will be o/p
public class RediMix extends Concrete {
	RediMix() {
		System.out.println("r ");

	}

	public static void main(String[] args) {
		new RediMix();
	}
}

class Concrete extends Sand {
	Concrete() {
		System.out.print("c ");
	}

	private Concrete(String s) {
	}
}

abstract class Sand {
	Sand() {
		System.out.print("s ");
	}
}
