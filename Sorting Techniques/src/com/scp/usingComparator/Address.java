package com.scp.usingComparator;

import java.util.*;

public class Address implements Comparator<Address> {

	private int pincode;
	private String city;
	
	public int getPincode(){
		return this.pincode;
	}
	
	public void setPincode(int a){
		this.pincode=a;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public void setCity(String c){
		this.city=c;
	}
	
	public String toString(){
		return "Address[pincode = "+ pincode +" City ="+ city +"]";
	}
	
	@Override
	public int compare( Address o1, Address o2) {
		
		return o1.getPincode()-o2.getPincode();
	}
	
	public static void main(String[] args) {
		
		Address ad1= new Address();
		ad1.setPincode(395007);
		ad1.setCity("Surat");
		
		Address ad2= new Address();
		ad2.setPincode(444556);
		ad2.setCity("Brisbane");
		
		Address ad3= new Address();
		ad3.setPincode(343455);
		ad3.setCity("Cranberra");
		
		StudentInfo s1 = new StudentInfo(11,"Konark", ad1);
		StudentInfo s2 = new StudentInfo(12,"Bhumik", ad2);
		StudentInfo s3 = new StudentInfo(13,"Paarth", ad3);
		
		ArrayList l1 = new ArrayList();
		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		
		System.out.println("Before sorting StudentInfo =" + l1);
		
		Collections.sort(l1,new SortbyName());
		
		System.out.println("\nAfter sorting based on name of student =" + l1);
		
		Collections.sort(l1,new SortbyPin());
		
		System.out.println("\nAfter sorting based on Pincode of Address =" + l1);

	}	

}


class SortbyName implements Comparator<StudentInfo>{

	@Override
	public int compare(StudentInfo o1, StudentInfo o2) {
		
		return o1.sname.compareTo(o2.sname);
	}
	
}

class SortbyPin implements Comparator<StudentInfo>{

	public int compare(StudentInfo o1, StudentInfo o2) {

		return o1.sdetails.getPincode()-o2.sdetails.getPincode();
	}
	
}

/*
 * Note : Related to using Comparator.
 * 
 *  We cannot create a class that has a sorting mechanism related to the composite class fields directly.
 *  We have to access them via the object of class in which the composite variable has been declared.  
 *  It will give us 'ClassCastException' for the composite class if we try to sort directly 'coz we 
 *  are storing the objects of class 'StudentInfo' in the ArrayList, which has the reference variable  
 *  of type composite class 'Address' in it.
 *  
 *  If we are using Comparator Interface then we have to define the sorting mechanism related to the 
 *  the fields of the class in a separate class which should implements the Comparator Interface mandatory.
 *  eg : Line no :- 75 and 85.
 *  
 *   We cannot define the Comparator's compare() method inside the class for which we want to implement 
 *   custom sort.// If we try to do so then i guess me must only store objects of those class in which
 *   we are declaring the compare() method.
 *  
 *  Generally, we should prefer creating anothoer class. And if we want to get ridd of writing this 
 *  separate sorting mechanism class then, we should go for another concept called 'Anonymous class'.
 *   
 *  
 *  
 */

