package com.tcs.interfacedemo;

import java.util.ArrayList;
import java.util.List;

public class Company {
public static void main(String[] args) {
	IStaff staff = new HR();
	staff.work();
	IStaff staff1 = new Guard();
	staff1.work();
	List<IStaff> allStaff = new ArrayList<IStaff>();
	allStaff.add(staff);
	allStaff.add(staff1);
	allStaff.add(staff1);
	System.out.println(allStaff.size());
	System.out.println(IStaff.count);

//	Staff s1 = new Staff();//not allowed
}

}
