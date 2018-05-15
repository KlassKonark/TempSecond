package com.scp.parent.child.serialize;

import java.io.*;

public class TestSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//parentBody p1 = new parentBody();
		childBody c1 = new childBody();
			
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\KONARK\\Desktop\\Java Program\\ParentChildSer.txt");
		//FileWriter fw = new FileWriter("C:\\Users\\KONARK\\Desktop\\Java Program\\ParentChildSer.txt");
		
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(c1);
		oos.close();
		fos.close();
		
		System.out.println(c1);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\KONARK\\Desktop\\Java Program\\ParentChildSer.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		childBody c2=(childBody)ois.readObject();
		ois.close();
		fis.close();
		
		System.out.println(c2);

	}

}
