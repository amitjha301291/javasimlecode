/**
 * 
 */
package com.hiber.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author Amit Jha
 *
 */
@Entity
@Table(name = "USER_DETAIL")
public class UserDetail implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	
	private String userName;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="USER_ADDRESS",joinColumns=@JoinColumn(name="USER_ID"))//I don't want FK from hibernate so i have used it
	@GenericGenerator(name="hilo-gen",strategy="hilo")
	@CollectionId(columns={@Column(name="Address_ID")},generator="hilo-gen",type=@Type(type="long"))
	
	//We want PK for Employee 
	Collection<Address> listofAddr=new ArrayList<Address>();
	/**
	 * @param listofAddr the listofAddr to set
	 */
	public void setListofAddr(Collection<Address> listofAddr) {
		this.listofAddr = listofAddr;
	}
	//We need to take the collection which support index
	/**
	 * @return the listofAddr
	 */
	
	/*@Temporal(TemporalType.DATE)
	//if we want a date in a specific way 
	private Date date;
	
	//To suggest DB that it is a big data type as it will check the type and create CLOB and BLOB according to it.
	@Lob
	private String address;
	
	@Transient
	//If we don't wnt this field in our database
	private String Desc;*/
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the listofAddr
	 */
	public Collection<Address> getListofAddr() {
		return listofAddr;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * @return the date
	 */
/*	public Date getDate() {
		return date;
	}
	*//**
	 * @param date the date to set
	 *//*
	public void setDate(Date date) {
		this.date = date;
	}
	*//**
	 * @return the address
	 *//*
	public String getAddress() {
		return address;
	}
	*//**
	 * @param address the address to set
	 *//*
	public void setAddress(String address) {
		this.address = address;
	}
	*//**
	 * @return the desc
	 *//*
	public String getDesc() {
		return Desc;
	}
	*//**
	 * @param desc the desc to set
	 *//*
	public void setDesc(String desc) {
		Desc = desc;
	}*/
	
}
