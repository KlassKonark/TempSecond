package com.scp.parent.child.serialize;

public class childBody extends parentBody {

	protected int cnum=22;
	protected String uname="Paris";
	protected String pswd = "France";
	//protected static String pswd = "Raju";
	
	/*
	public childBody(int n, String random, int cnum, String cword) {
		super(n, random);
		this.cnum = cnum;
		this.cword = cword;
	}

	public int getCnum() {
		return cnum;
	}

	public void setCnum(int cnum) {
		this.cnum = cnum;
	}

	public String getCword() {
		return cword;
	}

	public void setCword(String cword) {
		this.cword = cword;
	}
*/
	@Override
	public String toString() {
		return "childBody [cnum=" + cnum + ", User name =" + uname + ",User Password ="+ pswd +" Parent int field ="+ n +", Parent String var ="+ random +", Parent Password ="+ pin +"]";
	}

	
	
}
