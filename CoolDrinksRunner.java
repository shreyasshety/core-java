package com.xworkz.crud;

import com.xworkz.crud.subcrud.Cooldrinks;

public class CoolDrinksRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cooldrinks ref = new Cooldrinks();

		ref.addbrandNames("fanta");
		ref.addbrandNames("coke");
		ref.addbrandNames("mirinda");
		ref.addbrandNames("pepsi");
		ref.addbrandNames("dew");
		ref.addbrandNames("cavins");
		ref.addbrandNames("slice");
		ref.addbrandNames("maaza");
		String[] cname = ref.getBrandNames(); // getter method we oly can see the values
		for (int i = 0; i < cname.length; i++) {
			System.out.println(cname[i]);
		}
		System.out.println("---------------------------------");

		ref.delete(100);
		ref.delete(2);
		ref.delete(1);
		System.out.println("---------------------------------");
		ref.update(0, "frooti");

	}

}
