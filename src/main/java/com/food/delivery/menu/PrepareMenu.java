package com.food.delivery.menu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class PrepareMenu {

	private Menu menu = new Menu();

	public void prepareMenu(String filePath) throws Exception {
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader(filePath));

		Category category = null;
		int lineCount = 1;
		while ((line = br.readLine()) != null) {
			if (lineCount <= 1) {
				lineCount++;
				continue;
			}
			String[] cell = line.split("\\|");

			String categoryStr = cell[0];
			Item item = new Item(cell[1], Float.parseFloat(cell[2]));

			if (category != null) {
				if (category.getCategoryName().contentEquals(categoryStr)) {
					category.addItem(item);
				} else {
					menu.addCategory(category);
					category = new Category(categoryStr);
					category.addItem(item);
				}
			} else {
				category = new Category(categoryStr);
				category.addItem(item);
			}

		}
		menu.addCategory(category);
		br.close();
	}

	public void displayMenu() {
		int totalCategory = menu.getCaterories().size();
		List<Category> categories = menu.getCaterories();
		for (int i = 0; i < totalCategory; i++) {
			Category category = categories.get(i);
			List<Item> items = category.getItems();
			int totalItems = category.getItems().size();

			System.out.println((i + 1) + ". " + category.getCategoryName());
			for (int j = 0; j < totalItems; j++) {
				Item item = items.get(j);
				System.out.println("\t" + (j + 1) + ". " + item.getItemName() + " => ₹" + item.getUnitPrice());
			}

		}
	}

	/*public static void main(String[] args) {
		String file = "menu_list.csv";
		PrepareMenu menu = new PrepareMenu();
		try {
			menu.prepareMenu(file);
			menu.displayMenu();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

}
