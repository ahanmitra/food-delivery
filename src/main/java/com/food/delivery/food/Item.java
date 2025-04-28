package com.food.delivery.food;

public class Item {
	
	private String itemName;
	
	private float unitPrice;

	public Item(String itemName, float unitPrice) {
		super();
		this.itemName = itemName;
		this.unitPrice = unitPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
