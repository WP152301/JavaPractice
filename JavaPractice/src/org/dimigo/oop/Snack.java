/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	   |_ Snack
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 5.
 * <pre>
 *
 * @author hojun
 * @version : 1.0
 */
public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack(){}
	
	
	
	
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int calcPrice(){
		return price*number;
	}
	
	public String toString(){
		return String.format("이름 : %s\n제조사 : %s\n가격 : %,d원\n개수 : %d개", name, company, price, number);
	}
	
}
