package com.hand.sushu;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入工资");
		double salary=scan.nextDouble();
		double score=salary-3500;
		double tax=0;
		if(score<0){
			tax=0;
		}else if(score<=1500){
			tax=score*0.03;
			
		}
     System.out.println("费用"+score);
	}
	

}
