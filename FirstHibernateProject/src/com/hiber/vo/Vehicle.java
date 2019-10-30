/**
 * 
 */
package com.hiber.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * @author Amit Jha
 *
 */
@Entity
@Table(name="Vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleid;
	private String name;
	/**
	 * @return the vehicleid
	 */
	public int getVehicleid() {
		return vehicleid;
	}
	/**
	 * @param vehicleid the vehicleid to set
	 */
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
