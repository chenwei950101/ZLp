package com.hand.sushu;

import java.util.Scanner;

public class Calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         System.out.print("请输入日期：");
         String dateString=scan.nextLine();
         int sum=0;
	        String yearString = dateString.substring(0,4);
	        String monthString = dateString.substring(5,7);
	        String dayString = dateString.substring(8,10);
	        int year = Integer.parseInt(yearString);
	        int month = Integer.parseInt(monthString);
	        int day = Integer.parseInt(dayString);
	        sum+=getDayByMonth(month);
	        sum+=day;
	        sum+=getDayByLeapYear(year,month);
	        System.out.println("你输入的日期为当年的第"+sum+"天");
	    }
	    //由月计算出的天数
	    private static int getDayByMonth(int month){
	        int sum=0;
	        switch (month){
	            case 1:sum=0;break;
	            case 2:sum=31;break;
	            case 3:sum=59;break;
	            case 4:sum=90;break;
	            case 5:sum=120;break;
	            case 6:sum=151;break;
	            case 7:sum=181;break;
	            case 8:sum=212;break;
	            case 9:sum=243;break;
	            case 10:sum=273;break;
	            case 11:sum=304;break;
	            case 12:sum=334;break;
	        }
	        return sum;
	    }
	    //计算闰年
	    private static int getDayByLeapYear(int year,int month){
	        if(year%400==0||(year%4==0&&year%100!=0)&&month>2)
	            return 1;
	        else
	            return 0;
	    }

	}
	

