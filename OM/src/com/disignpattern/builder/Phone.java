/**
 * 
 */
package com.disignpattern.builder;

/**
 * @author Amit Jha
 *
 */
public class Phone {

	private String os;
	private String ram;
	private String processor;
	private String screenSize;
	private String battery;
	/**
	 * @param os
	 * @param ram
	 * @param processor
	 * @param screenSize
	 * @param battery
	 */
	public Phone(String os, String ram, String processor, String screenSize,
			String battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor
				+ ", screenSize=" + screenSize + ", battery=" + battery + "]";
	}
	
	
}
