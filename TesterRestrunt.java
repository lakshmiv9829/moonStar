package tester;

import com.xworkz.moon.dto.MenuDTO;

import Finder.Finder;
import Finder.FinderImpl;
import service.RestaurantService;
import service.RestaurantServiceImpl;

public class TesterRestrunt {

	public static void main(String[] args) {
		RestaurantService restaurantService = new RestaurantServiceImpl();

		// restaurantService.displayItemGreaterThan(200);
		
		
		// Finder finder=new FinderImpl(); finder=new VegFinderImpl();
		//functional interface;
		restaurantService.findAndDisplay(new Finder() {
			public boolean test(MenuDTO dto) {
				if (dto.getPrice() < 200) {
					return true;
				}
				return false;
			}
		});
		//lamda expression
		restaurantService.findAndDisplay(d->d.getPrice()>300);

	}

}
