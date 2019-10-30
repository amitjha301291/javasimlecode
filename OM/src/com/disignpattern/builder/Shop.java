/**
 * 
 */
package com.disignpattern.builder;

/**
 * @author Amit Jha
 *
 */
public class Shop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Phone p=new Phone("window","2","Snapdragon","11.2","2300mah");
		/*If we will nt use Builder pattern we need to specify all the values inside constructor
		 * 
		 * */
		//Here you are not specifying all the values
		Phone phonebuilder=new PhoneBuilder().setBattery("2600").setOs("Android").getPhone();
		
        System.out.println(p);
        System.out.println(phonebuilder);
	}

}
