package com.cg.springone.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springone.service.Employee;
import com.cg.springone.service.Mobile;
import com.cg.springone.service.SBU;
import com.cg.springone.service.Shape;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
                        
		       Shape sp=(Shape)app.getBean("cir");
		       sp.getShape();
		       
		       Mobile mobile=(Mobile) app.getBean("mob");
		       mobile.getAllDetails();
		       
		       
		       System.out.println("enter Mobileid");
		       Scanner sc=new Scanner(System.in);
		       int st=sc.nextInt();
		       mobile.setMobId(st);
		       mobile.getAllDetails();
		       
		       Employee ep=(Employee) app.getBean("employee");
		       SBU ab=(SBU)app.getBean("sbu");
			    ep.setBusinessUnit(ab);
		       ep.getDetails();
	
		       
		   
		       
		       
		       
	}

}
