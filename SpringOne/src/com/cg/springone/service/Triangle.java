package com.cg.springone.service;

public class Triangle implements Shape {
String sides;





	public String getSides() {
	return sides;
}





public void setSides(String sides) {
	this.sides = sides;
}





	@Override
	public void getShape() {
		// TODO Auto-generated method stub
		System.out.println("triangle shape"+sides);
		
	}

}
