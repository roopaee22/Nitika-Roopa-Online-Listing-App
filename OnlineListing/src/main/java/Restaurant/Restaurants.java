package Restaurant;

public class Restaurants {
	
	String restaurantName;

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	@Override
	public String toString() {
		return "Restaurants [restaurantName=" + restaurantName + "]";
	}

}
