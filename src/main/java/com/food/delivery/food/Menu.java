package com.food.delivery.food;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<Category> caterories = new ArrayList<Category>();
	
	public void addCategory(Category category) {
		this.caterories.add(category);
	}

	public List<Category> getCaterories() {
		return caterories;
	}

	public void setCaterories(List<Category> caterories) {
		this.caterories = caterories;
	}
	
	
}
