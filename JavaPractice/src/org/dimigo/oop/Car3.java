/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	   |_ Book
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 22.
 * <pre>
 *
 * @author hojung
 * @version : 1.0
 */
public class Car3 {
	//클래스 필드 선언
	//getter 메소드
	public String company = "현대자동차";
	public String model = "제네시스";
	public String color = "검정색";
	public int maxSpeed = 225;
	public int price = 50000000;
	
	public Car3(String Company, String Model, String Color, int MaxSpeed, int Price) { 
	      this.company = Company;
	      this.model = Model;
	      this.color = Color;
	      this.maxSpeed = MaxSpeed;
	      this.price = Price;
	   }
	public Car3(String Company, String Model, String Color, int MaxSpeed){
		this("기아자동차", "K7", "흰색", 246, 0);
		
		
	}
	public Car3(String company, String Model, String Color){
		this("삼성자동차", "SM7", "회색", 0, 0);
	}
	//클래스 메소드 선언
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getmaxSpeed(){
		return maxSpeed;
	}
	public int getPrice(){
		return price;
	}
	
	public void setCompany(String newCompany){
		company = newCompany;
	}
	public void setModel(String newModel){
		model = newModel;
	}
	public void setColor(String newColor){
		color = newColor;
	}
	public void setMaxSpeed(int newMaxSpeed){
		maxSpeed = newMaxSpeed;
	}
	public void setPrice(int newPrice){
		price = newPrice;
	}
	
}
