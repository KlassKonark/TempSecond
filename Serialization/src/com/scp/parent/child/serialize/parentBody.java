package com.scp.parent.child.serialize;

import java.io.*;

public class parentBody implements Serializable {

 /**
	 * 
	 */
//private static final long serialVersionUID = 1L;
	
	
 protected int n=12;
 protected String random="Sid";
 transient int pin = 1250;
 protected static float d =140;
 
 
 
 

 private void writeObject(ObjectOutputStream os) throws IOException{
	 os.defaultWriteObject();
	 int epin = pin-250;
	 os.writeObject(epin);	 
 }

 private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException{
	 is.defaultReadObject();
	 int epin = (int)is.readObject();
	 System.out.println(epin);
	 pin=epin+250;
	 System.out.println(pin);
	 
 }

@Override
public String toString() {
	return "parentBody [n=" + n + ", random=" + random + ", pin=" + pin + "]";
}
 
 
 
/*
 public parentBody(int n, String random) {
		super();
		this.n = n;
		this.random = random;
 }
 
public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}
public String getRandom() {
	return random;
}

public void setRandom(String random) {
	this.random = random;
}
public static float getD() {
	return d;
}
public static void setD(float d) {
	parentBody.d = d;
}
*/ 

		
}
