package com.lms.bean;

public class Student {
private String sName;
private int sId;
private String sDept;
private int sYear;
private String bName;
private int bId;
private String iDate;
private String rDate;


public String getiDate() {
	return iDate;
}
public void setiDate(String iDate) {
	this.iDate = iDate;
}
public String getrDate() {
	return rDate;
}
public void setrDate(String rDate) {
	this.rDate = rDate;
}

public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getsDept() {
	return sDept;
}
public void setsDept(String sDept) {
	this.sDept = sDept;
}
public int getsYear() {
	return sYear;
}
public void setsYear(int sYear) {
	this.sYear = sYear;
}
public String getbName() {
	return bName;
}
public void setbName(String bName) {
	this.bName = bName;
}
public int getbId() {
	return bId;
}
public void setbId(int bId) {
	this.bId = bId;
}

}
