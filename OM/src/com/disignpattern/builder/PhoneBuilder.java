/**
 * 
 */
package com.disignpattern.builder;

/**
 * @author Amit Jha
 *
 */
public class PhoneBuilder {

	private String os;
	private String ram;
	private String processor;
	private String screenSize;
	private String battery;
	/**
	 * We will return PhoneBuilder inside setter
	 */
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	/**
	 * @param ram the ram to set
	 */
	public PhoneBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}
	/**
	 * @param processor the processor to set
	 */
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	/**
	 * @param screenSize the screenSize to set
	 */
	public PhoneBuilder setScreenSize(String screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	/**
	 * @param battery the battery to set
	 */
	public PhoneBuilder setBattery(String battery) {
		this.battery = battery;
		return this;
	}
	
	//This will return phone object
	public Phone getPhone(){
		return new Phone(os, ram, processor, screenSize, battery);
	}
	
}
