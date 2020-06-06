package com.FatOff.Controller;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import com.FatOff.Model.Admin;
import com.FatOff.Model.Customer;
import com.FatOff.Model.Nutritionist;
import com.FatOff.Model.SaveRestore;
import com.FatOff.View.InitialWin;

public class CustomerController {

	public CustomerController() {

	}

	public static Customer createCustomer(String fName, String lName, String phone, String email, String id,
			Date bDate,String gender, String pathToCustomer) {
		System.out.println("From customer controller + " + pathToCustomer);

		Customer cust = new Customer(fName, lName, phone, email, id, gender , bDate);
		SaveRestore<Customer> saveCust = new SaveRestore<Customer>(cust, pathToCustomer);

		try {
			saveCust.storeCustomer(pathToCustomer, cust);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cust;
	}

	public static String pathToType(Nutritionist nut , String custFolderName) {
		String folderName = nut.getFirstName() + "_" + nut.getLastName() + "_" + nut.getId();
		File pathToDieticion = new File(SaveRestore.getPath() + "/Dieticions");
		File pathToAdmin = new File(SaveRestore.getPath() + "/Admin");
		String pathToReturn = "";
		for (String desired : pathToAdmin.list()) {
			if (desired.equals(".DS_Store")) {
				continue;
			}
			if (desired.equals(folderName)) {
				pathToReturn = pathToAdmin.toString() + "/" + folderName + "/Customers/" + custFolderName;
				break;
			}

		}
		if (pathToReturn.equals("")) {
			for (String desired : pathToDieticion.list()) {
				if (desired.equals(".DS_Store")) {
					continue;
				}

				if (desired.equals(folderName)) {
					pathToReturn = pathToDieticion.toString() + "/" + folderName + "/Customers/" + custFolderName;
					break;
				}

			}

		}

		return pathToReturn;
	}
	
	public static String calcAge(Customer cust) {
		
		Date today = new Date();
		Date custDate = cust.getDateOfBirth();
		
		int diff = (int)((today.getTime() - custDate.getTime())/(24*60*60*1000));
		System.out.println(today.getTime());
		System.out.println(custDate.getTime());
		System.out.println(today.getTime() - custDate.getTime());
		System.out.println(diff);
		return new DecimalFormat("##.#").format((double)diff/365);
		}
}
