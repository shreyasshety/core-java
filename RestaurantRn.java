package com.xworkz.crud;

import com.xworkz.crud.subcrud.Restaurant;

public class RestaurantRn {

public static void main(String[] args) {
// TODO Auto-generated method stub
Restaurant ref = new Restaurant();

String rname = ref.getName();
System.out.println(rname);
ref.Addnames("bangalore");
ref.Addnames("mysore");
ref.Addnames("mangalore");
ref.Addnames("Andra");
ref.Addnames("kolkata");
ref.Addnames("kolkata");
ref.Displaynames();
}

}

