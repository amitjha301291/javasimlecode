/**
 * 
 */
package com.disignpattern.factory;

/**
 * @author Amit Jha
 *
 */
public class Server implements Computer{
	
	private String ram;
	private String cpu;
	private String hdd;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Server [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + "]";
	}


	public Server(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
		}

	
	@Override
	public String getRam() {
		
		return this.ram;
	}

	
	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}


	@Override
	public String getHDD() {
		
		return this.hdd;
	}

}
