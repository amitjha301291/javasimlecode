/**
 * 
 */
package com.disignpattern.factory;

/**
 * @author Amit Jha
 *
 */
public class ComputerFactory {

	public static Computer getComputer(String type,String ram,String hdd,String cpu){
		
		if("PC".equalsIgnoreCase(type)){
			return new PC(ram,hdd,cpu);
		}
		else if("server".equalsIgnoreCase(type)){
			return new PC(ram,hdd,cpu);
		}
		return null; 
	}
}
