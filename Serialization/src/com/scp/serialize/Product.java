package com.scp.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Product implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	public  transient int Pid;
	public String Pname;
	public String Pdesg;
	public transient static int Pprice=10;  


	
	
	public Product(int pid, String pname,String p) {
		super();
		Pid = pid;
		Pname = pname;
		Pdesg=p;
	}


	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", Pname=" + Pname + ", Pdesignatin ="+ Pdesg +"]";
	}

	
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Product P = new Product(12,"Musa","HR");
		Product P2= new Product(24,"Brown Bunny","Emp");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\KONARK\\Desktop\\Java Program\\newfile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(P);
		oos.writeObject(P2);
		
		System.out.println("Adding serialize object to File\n");
		System.out.println(P);
		System.out.println(P2);
		System.out.println("\n");
		
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\KONARK\\Desktop\\Java Program\\newfile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Product P3=(Product)ois.readObject();
		Product P4=(Product)ois.readObject();
		ois.close();
		fis.close();
		
		
		System.out.println("Displaying serialize Object after adding 'transient' keyword on the Product Id.\n");
		System.out.println(P3);
		System.out.println(P4);
		
		
		
		
		
	}

}
