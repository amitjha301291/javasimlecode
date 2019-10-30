/**
 * 
 */
package com.disignpattern.abstratfactory;

import com.disignpattern.factory.Computer;
import com.disignpattern.factory.Server;

/**
 * @author Amit Jha
 *
 */
public class ServerFactory implements ComputerAbstractFactory{

	private String ram;
	private String cpu;
	private String hdd;
	
	public ServerFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
		}
	@Override
	public Computer createComputer() {
		
		return new Server(ram,hdd,cpu);
	}

}
