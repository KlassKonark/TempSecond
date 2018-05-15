package com.scp.usingComparator;

import java.util.Comparator;

public class StudentInfo  {
	
	//implements Comparator<StudentInfo>
	
	protected int rno;
	protected String sname;
	protected Address sdetails;
	
	public StudentInfo(int n, String x, Address d){
		this.rno=n;
		this.sname=x;
		this.sdetails=d;
	}
	
	public String toString(){
		return "\nStudentInfo[rno ="+ rno +" sname ="+ sname +" sdetails = " + sdetails+"]";
		
	}

	/*@Override
	public int compare(StudentInfo o1, StudentInfo o2) {
		
		return o1.sname.compareTo(o2.sname);
	}
*/
}
