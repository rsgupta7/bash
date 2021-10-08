package com.bash;



import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;


import org.testng.annotations.Test;


public class Testing {
	@Test
	public void  main() {
		
		
	 System.out.println("System properties : " + System.getProperty("dbUrl"));
	  System.out.println("System properties : " + System.getProperty("dbPassword"));
    	 try {
    	      File myObj = new File("filename.txt");
    	      if (myObj.createNewFile()) {
    	        System.out.println("File created: " + myObj.getName());
    	      } else {
    	        System.out.println("File already exists.");
    	      }
    	    } catch (IOException e) {
    	      System.out.println("An error occurred.");
    	      e.printStackTrace();
    	    }
    	  }
			
	

}
