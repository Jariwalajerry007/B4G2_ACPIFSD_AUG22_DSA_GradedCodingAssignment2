package com.gradedcoding.assignment2.Skyscrapermain;

import java.util.Scanner;

import com.gradedcoding.assignment2.Skyscrapermethod.Builder;

public class Assemble {

	public static void main(String[] args) {
		try (
				
				Scanner sc = new Scanner(System.in)){
			
          			System.out.println("enter the total no of floors in the building");

    			       int noOffloor = sc.nextInt();
 
                       int[] floors = new int[noOffloor];

		            	for (int i = 0; i < noOffloor; i++) {
			                   
		            		System.out.println("Enter the floor size given on day : " + (i + 1));
				            
		            		floors[i] = sc.nextInt();
			             }
			
		            	System.out.println();

		            	Builder B = new Builder();
		             	B.structure(floors, noOffloor);
		
		              }
	          }
      }
