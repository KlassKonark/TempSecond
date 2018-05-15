package com.scp.usingComparable;

import java.util.*;

public class VehicleInfo  implements Comparable<VehicleInfo>{

	private int vid;
	private String vname;
	protected Manufacture mdetails;
	
	
	public VehicleInfo(int id, String name, Manufacture md){
		
		this.vid=id;
		this.vname= name;
		this.mdetails=md;
		
	}
	
	public int getVid() {
		return vid;
	}


	public void setVid(int vid) {
		this.vid = vid;
	}

	
	public String getVname() {
		return vname;
	}


	public void setVname(String vname) {
		this.vname = vname;
	}

	
	public Manufacture getMdetails() {
		return mdetails;
	}

	
	public void setMdetails(Manufacture mdetails) {
		this.mdetails = mdetails;
	}


	@Override
	public String toString() {
		return "VehicleInfo [vid=" + vid + ", vname=" + vname + ", mdetails=" + mdetails + "]";
	}

	@Override
	public int compareTo(VehicleInfo ob) {
	
		return this.getMdetails().getMake().compareTo(ob.getMdetails().getMake());
	}
	
	
	public static void main(String[] args) {
		
		Manufacture m1 = new Manufacture();
		m1.setMake("Mahindra");
		m1.setYom(2015);
		
		Manufacture m2 = new Manufacture();
		m2.setMake("Honda");
		m2.setYom(2017);
		
		Manufacture m3 = new Manufacture();
		m3.setMake("TVS");
		m3.setYom(2015);
		
		Manufacture m4 = new Manufacture();
		m4.setMake("Activa");
		m4.setYom(2010);
		
		VehicleInfo v1 = new VehicleInfo(101,"Vespa",m1);
		VehicleInfo v2 = new VehicleInfo(121,"Aprilla",m2);
		VehicleInfo v3 = new VehicleInfo(153,"Jupiter",m3);
		VehicleInfo v4 = new VehicleInfo(97,"Activa",m4);
		
		List l1 = new ArrayList();
		
		l1.add(v1);
		l1.add(v2);
		l1.add(v3);
		l1.add(v4);
		
		System.out.println("List before Sorting " + l1);
		
		Collections.sort(l1);
		
		System.out.println("\nThe Sorted List =" + l1);
		
		

	}

	

}
