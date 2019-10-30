/**
 * 
 */
package com.disignpattern.abstratfactory;

import com.disignpattern.factory.Computer;

/**
 * @author Amit Jha
 *
 */
public class ComputerAbsFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
		}
}
