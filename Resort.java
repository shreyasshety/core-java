package com.xworkz.crud.subcrud;

public class Resort {
private String resortname;
// private String names;
private String[] branch = new String[5];

int count = 0;

public Resort() {
this("green valley");
System.out.println("invoked name");

}

public Resort(String resortname) {
this.resortname = resortname;
System.out.println("invoked branch");

}

public String getResortname() {

return resortname;

}

public void addbranch(String branch) {
if (this.count < 5) {
this.branch[this.count] = branch;
this.count++;
} else {
System.err.println("error");

}
}

public void display() {
for (int i = 0; i < branch.length; i++) {
String branch = this.branch[i];
System.out.println(branch);

}

}

}
