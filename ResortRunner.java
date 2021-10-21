package com.xworkz.crud;

import com.xworkz.crud.subcrud.Resort;

public class ResortRunner {

public static void main(String[] args) {
// TODO Auto-generated method stub
Resort resort=new Resort();
//resort.Resort();

String rname=resort.getResortname();
System.out.println(rname);
resort.addbranch("bangalore");
resort.addbranch("mysore");
resort.addbranch("mangalore");
resort.addbranch("Andra");
resort.addbranch("kolkata");
//resort.addbranch("ssss");
resort.display();



}

}

