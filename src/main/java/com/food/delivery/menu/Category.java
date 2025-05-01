package com.food.delivery.menu;

import java.util.ArrayList;
import java.util.List;

public class Category {
	
	private String categoryName;
	
	private List<Item> items = new ArrayList<Item>();
	
	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}
	
	public Category(String categoryName, List<Item> items) {
		super();
		this.categoryName = categoryName;
		this.items = items;
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
	

}
