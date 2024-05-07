package com.kh.practice.book.model.vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book {

	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price, Calendar date, double discount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
	
	public String toString() {
	
		
		return "도서명 : " + title + "\n저자명 : " + author + "\n가격 : " + price
				+ "\n출판날짜 : " + date + "\n할인율 : " + discount;
	}
}
