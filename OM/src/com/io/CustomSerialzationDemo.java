/**
 * 
 */
package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Amit Jha
 *
 */
public class CustomSerialzationDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
	Account acc=new Account();
	System.out.println(acc.username+"+++"+acc.paswrd);
	FileOutputStream fos=new FileOutputStream("abc.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(acc);
	FileInputStream fis=new FileInputStream("abc.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Account acc1=(Account)ois.readObject();
	System.out.println(acc1.username+"+++"+acc1.paswrd);

	}

}
class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String username="Amit";
	transient String paswrd="amit";
}
