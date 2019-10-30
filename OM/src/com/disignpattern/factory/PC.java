/**
 * 
 */
package com.disignpattern.factory;

/**
 * @author Amit Jha
 *
 */
public class PC implements Computer {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PC [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + "]";
	}


	private String ram;
	private String cpu;
	private String hdd;
	
	public PC(String ram, String hdd, String cpu){
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
		
		return this.cpu;
	}

	
	@Override
	public String getHDD() {
		
		return this.hdd;
	}

}
