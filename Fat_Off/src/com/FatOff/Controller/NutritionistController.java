package com.FatOff.Controller;

import java.io.IOException;

import com.FatOff.Model.Nutritionist;
import com.FatOff.Model.SaveRestore;

public class NutritionistController {
	
	public static boolean createNutritionist(String firstName, String lastName, String phoneNumber, String emailAddress,
			String id, int licenseId, String password) {
		try {
			Nutritionist nut = new Nutritionist(firstName, lastName, phoneNumber, emailAddress, id, licenseId,
					password);
			SaveRestore<Nutritionist> saveNutritionist = new SaveRestore<Nutritionist>(nut, SaveRestore.getPath()+"/");
			saveNutritionist.storeToFile("");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean storeNutritionist(Nutritionist nut) {
		try {
			SaveRestore<Nutritionist> saveNut = new SaveRestore<Nutritionist>(nut, SaveRestore.getPath()+"/");
			saveNut.storeToFile("");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public static Nutritionist restoreNut(String NutName) {
		Nutritionist nut = null;
		try {
			nut = (Nutritionist)SaveRestore.restoreFromFile(NutName, "Nutritionist");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nut;
	}


}
