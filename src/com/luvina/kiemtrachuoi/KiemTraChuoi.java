package com.luvina.kiemtrachuoi;

public class KiemTraChuoi {
	private String text;

	public KiemTraChuoi(String text) {
		this.text = text;
	}

	public void check() {

		boolean soNguyen = true;
		boolean soThuc = true;
		boolean logic = true;

		String temp = "";

		for (int i = 0; i < text.length(); i++) {
			temp = text.charAt(i) + "";
			if (temp.matches("\\D")) {
				soNguyen = false;
				break;
			}
		}
		for (int i = 0; i < text.length(); i++) {
			temp = text.charAt(i) + "";
			if (!temp.matches("[\\d&.]")) {
				soThuc = false;
				break;
			}
		}
		if(!(text.contains(">")|| text.contains(">=") || text.contains("<")|| text.contains("<=")|| text.contains("="))) {
			logic = false;
		}
		else {
			if(text.charAt(0)=='<'|| text.charAt(0)=='>' || text.charAt(0)=='=') {
				logic = false;
			}
		}
		if (soNguyen) {
			System.out.println("Chuỗi là số nguyên!!!");
		} else if (soThuc) {
			System.out.println("Chuỗi là số thực");
		} else if (logic) {
			System.out.println("Chuỗi là chuỗi logic");
		} else {
			System.out.println("<< undefind >>");
		}
	}

}
