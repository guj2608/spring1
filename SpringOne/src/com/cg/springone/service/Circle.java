package com.cg.springone.service;

public class Circle implements Shape{
     String radius;  //instance variables
   

	public void setradius(String radius) {   //setter injection
		this.radius = radius;
	}

//only setter is important in property




	@Override
	public void getShape() {
		// TODO Auto-generated method stub
		System.out.println("circle shape with radius"+radius);
	}

}
