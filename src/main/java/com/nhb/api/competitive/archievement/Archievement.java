package com.nhb.api.competitive.archievement;

public class Archievement {
	public static Integer CP = 0;
	public static Integer TD = 1;
	public static Integer IN = 2;
	public static Integer CS = 3;
	public static Integer MVP = 4;
	private Integer type;
	public static Integer getCP() {
		return CP;
	}
	public static void setCP(Integer cP) {
		CP = cP;
	}
	public static Integer getTD() {
		return TD;
	}
	public static void setTD(Integer tD) {
		TD = tD;
	}
	public static Integer getIN() {
		return IN;
	}
	public static void setIN(Integer iN) {
		IN = iN;
	}
	public static Integer getCS() {
		return CS;
	}
	public static void setCS(Integer cS) {
		CS = cS;
	}
	public static Integer getMVP() {
		return MVP;
	}
	public static void setMVP(Integer mVP) {
		MVP = mVP;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Archievement [type=" + type + "]";
	}
	
}
