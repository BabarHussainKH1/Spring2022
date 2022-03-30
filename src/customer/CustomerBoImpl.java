package customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CustomerBoImpl implements CustomerBo {
	public void addCustomer() {
		try {
			FileInputStream inputStream = new FileInputStream(new File(""));
		} catch (FileNotFoundException e) {
//			throw new RuntimeException("My Exception");
		}
		System.out.println("addCustomer() is running ");
	}

	public String addCustomerReturnValue() {
		System.out.println("addCustomerReturnValue() is running ");
		return "abc";
	}

	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}

	public void addCustomerAround(String name) {
		System.out.println("addCustomerAround() is running, args : " + name);
	}
	
}
