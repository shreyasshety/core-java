package com.xworkz.crud.subcrud;

public class Restaurant {
private String name;
private String[] branches = new String[5];
int count = 0;

public Restaurant() {
// TODO Auto-generated constructor stub
this("NANDANA");
System.out.println("Restaurant name is:" + name);
}

public Restaurant(String name) {
this.name = name;

}

public String getName() {
return name;
}

public void Addnames(String branches) {
if (count < 5) {
this.branches[this.count] = branches;
this.count++;
} else {
System.err.println("CANT ADD LIMIT EXCEEDED");
}
}

public void Displaynames() {
for (int i = 0; i < branches.length; i++) {
System.out.println(branches[i]);

}
}

}