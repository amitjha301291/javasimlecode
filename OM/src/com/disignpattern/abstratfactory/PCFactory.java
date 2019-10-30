/**
 * 
 */
package com.disignpattern.abstratfactory;

import com.disignpattern.factory.Computer;
import com.disignpattern.factory.PC;

/**
 * @author Amit Jha
 *
 */
public class PCFactory implements ComputerAbstractFactory{

	private String ram;
	private String cpu;
	private String hdd;
	
	public PCFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
		}
	
	@Override
	public Computer createComputer(){
		return new PC(ram, hdd, cpu);
	}
}
