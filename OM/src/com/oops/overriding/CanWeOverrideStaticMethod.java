/**
 * 
 */
package com.oops.overriding;

/**
 * @author Amit Jha
 *
 */
/**
*
* Java program which demonstrate that we can not override static method in Java.
* Had Static method can be overridden, with Super class type and sub class object
* static method from sub class would be called in our example, which is not the case.
* @author
*/

/*what is method hidding in java?
		static method cannot be overriding in Java because their method calls are resolved at
		compile time but it didn't prevent you from declaring method with same name in sub class. 
		In this case we say that method in sub class has hided static method from parent class.
		If you have a case where variable of Parent class is pointing to object of Child class then 
		also static method
		from Parent class is called 
		because overloading is resolved at compile time. See here to learn more about method hiding in Java*/
public class CanWeOverrideStaticMethod {
 
   public static void main(String args[]) {
     
       Screen scrn = new ColorScreen();
     
       //if we can  override static , this should call method from Child class
       scrn.show(); //IDE will show warning, static method should be called from classname
     
   }  
 
}

class Screen{
 
   /*
    * public static method which can not be overridden in Java
    */
   public static void show(){
       System.out.printf("Static method from parent class");
   }
}

class ColorScreen extends Screen{
   /*
    * static method of same name and method signature as existed in super
    * class, this is not method overriding instead this is called
    * method hiding in Java
    */
   public static void show(){
       System.err.println("Overridden static method in Child Class in Java");
   }
}
