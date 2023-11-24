package AirLine;

import java.util.Comparator;

/*
 * This class implements a comparator that reflects a protocol. The rules
 * are: 1. Passenger with a greater seating get priority; 2. Passenger with the same seating who
 * arrive earlier get priority.
 *
 */
public class PassengerComparator implements Comparator<Passenger> {

	/**
	 * This method compares two passengers and determines which one is prioritized
	 * first
	  * return 1 if the first passenger is prioritized, -1 if the second passenger is
	 *  prioritized, and 0 if they have equal priorities
	 */
	@Override
	public int compare(Passenger passenger1, Passenger passenger2) {
		int ret = passenger2.getSeating().compareTo(passenger1.getSeating());

		if (ret == 0) {
			ret = passenger1.getArrivalTime().compareTo(passenger2.getArrivalTime());
		}
		return ret;
	}
}
