﻿package ex;
/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白分開。例如:輸入128917178, 
則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 105021059 王俊鑌
 */
import java.util.Scanner;
public class ex03 {
		

		public static void main(String args[]){
			Scanner scn = new Scanner(System.in);
			String n =scn.next();
			decomp(n);
			
		}
		
		public static void decomp(String n ) {
			// TODO Auto-generated method stub
			for(int i=0; i< n.length();i++){
				
				System.out.print(n.charAt(i)+" ");
				
				
			}
			
		}
		}
			
			
		
		
		
		
		
		

		
		