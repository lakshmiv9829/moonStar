package service;

import Finder.Finder;

public interface RestaurantService {
	public void displayItemGreaterThan(double price);

	public void displayByName(String name);

	public void findAndDisplay(Finder finder);

}
