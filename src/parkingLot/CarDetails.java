package parkingLot;
/**
amangupta
*/
public class CarDetails {
	private int Id;
	private int carId;
	private int slot;
	private int color;
	
	public CarDetails(int carId) {
		this.carId = carId;
	}
	
	public CarDetails(int id, int carId, int slot, int color) {
		Id = id;
		this.carId = carId;
		this.slot = slot;
		this.color = color;
	}

	public int getId() {
		return Id;
	}

	public int getCarId() {
		return carId;
	}

	public int getSlot() {
		return slot;
	}

	public int getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarDetails other = (CarDetails) obj;
		if (carId != other.carId)
			return false;
		return true;
	}
	
	
	
}
