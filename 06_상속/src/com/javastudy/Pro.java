package com.javastudy;
import java.util.Scanner;
//import java.lang.*;
public class Pro {

	int price;
	String name;
	public Pro(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void show() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǰ��2: "+name+" ���� :"+price);
	}
}
