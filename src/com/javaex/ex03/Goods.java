package com.javaex.ex03;

public class Goods {

	private String name;
	private int price;
	private int count;

	public Goods(String name, int price, int count) {
		this.name = name;
		this.count = count;
		this.price = price;
	}
	public void show() {
		System.out.println(name+"(가격:"+price+"원)이 "+count+"개 입고 되었습니다.");
	}
	public int getCount() {
		return this.count;
	}
}
