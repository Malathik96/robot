package org.newDay;

public class Student extends Student2 {
	
	//public
	public void emp_id() {
		System.out.println("1");
		
	}
	//default
	 private void emp_name() {
		System.out.println("Malathi");

	}
	
	 //protected
	private void gender() {
		System.out.println("F");

	}
	
    private void locations() {
        System.out.println("chennai");
	}
	
public static void main(String[] args) {
	
	Student sd=new Student();
	
	sd.emp_id();
	sd.emp_name();
	sd.gender();
    sd.locations();
	sd.salary();
	sd.DOJ();
	
	
}

}
