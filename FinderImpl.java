package Finder;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.dto.MenuDTO.Type;

public class FinderImpl implements Finder{

	@Override
	public boolean test(MenuDTO dto) {
		System.out.println("test method");
		if (dto != null && dto.getType().equals(Type.NONVEG)) {
			return true;
		}
		return false;
	}

}
