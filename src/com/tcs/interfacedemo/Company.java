package com.tcs.interfacedemo;

import java.util.ArrayList;
import java.util.List;

public class Company {
public static void main(String[] args) {
	Staff staff = new HR();
	staff.work();
	Staff staff1 = new Guard();
	staff1.work();
	List<Staff> allStaff = new ArrayList<Staff>();
	allStaff.add(staff);
	allStaff.add(staff1);
	allStaff.add(staff1);
	System.out.println(allStaff.size());
	System.out.println(Staff.count);

//	Staff s1 = new Staff();//not allowed
}

}
