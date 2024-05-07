package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{

	private boolean coupon; //쿠폰유무
	
	public CookBook() {
		// TODO Auto-generated constructor stub
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return super.toString() + "쿠폰 사용가능여부 : " + coupon;
	}
	
	
}
