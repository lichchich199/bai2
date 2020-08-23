package com.luvina.kiemtrachuoi.main;

import com.luvina.kiemtrachuoi.KiemTraChuoi;

public class Main {
	public static void main(String[] args) {
		KiemTraChuoi kiemTraChuoi = new KiemTraChuoi("2dsadacacv");
		KiemTraChuoi kiemTraChuoi1 = new KiemTraChuoi(">b");
		KiemTraChuoi kiemTraChuoi2 = new KiemTraChuoi("a>b");
		KiemTraChuoi kiemTraChuoi3 = new KiemTraChuoi("2.22246546572222222222222222");
		KiemTraChuoi kiemTraChuoi4 = new KiemTraChuoi("2.222465465722ss33sd22222222sdsd222222");
		kiemTraChuoi.check();
		kiemTraChuoi1.check();
		kiemTraChuoi2.check();
		kiemTraChuoi3.check();
		kiemTraChuoi4.check();
	}
}
