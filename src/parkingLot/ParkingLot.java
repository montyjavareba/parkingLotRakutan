package parkingLot;
/**
amangupta
*/

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
	int thrusHold=10;
	int counter=0;
	CarDetails slot[]=new CarDetails[10];
	Map<CarDetails, CarDetails> map=new HashMap<CarDetails, CarDetails>();
	
	public void insertCar(CarDetails car) {
		if(!avail()) {
			return;
		}
		int slotNo=getFirstSlot();
		map.put(car, car);
		slot[slotNo]=car;
		incCounter();
	}
	
	public CarDetails RemoveCarByCarId(int  carId) {
		CarDetails res=getDetailsByCarId(carId);
		map.remove(res);
		slot[res.getSlot()]=null;
		return res;
	}
	
	public CarDetails getDetailsByCarId(int carId) {
		CarDetails car=new CarDetails(carId);
		return map.get(car);
	}
	
	public CarDetails getDetailsBySlotNo(int sNo) {
		return slot[sNo];
	}
	
	public int getFirstSlot() {
		int i=0;
		for(;i<thrusHold;i++) {
			if(slot[i]==null)
				break;
		}
		return i;
	}
	
	public void incCounter() {counter++;}
	public void decCounter() {counter--;}
	public Boolean avail() {
		if(counter<thrusHold) {
			return true;
		}else
		{
			return false;
		}
	}
}
