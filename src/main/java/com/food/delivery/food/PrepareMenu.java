package com.food.delivery.food;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrepareMenu {
	
	public void readCSV(String filePath) throws Exception {
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		
            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); 
                for (String value : values) {
                    // 1. Prepare category
                	// 2. Prepare Item
                }
                System.out.println();
            }
        
		
	}
	
	public void prepareItems() {
		
	}
	
	public void prepareMenu() {
		
	}

}
