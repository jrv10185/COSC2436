package AirLine;

import java.time.LocalTime;
import java.util.Comparator;

/**
 * This class implements an Airline Boarding that has a priority queue for
 * passengers that check in. The priority is determined by a comparator that
 * implements a specific protocol.
 *
 */
public class AirlineBoarding {
	private final ComparatorHeap<Passenger> line;


	public AirlineBoarding(Comparator<Passenger> comparator) {
		line = new ComparatorHeap<>(comparator);
	}

	/**
	 * This method checks in a passenger and places them into a priority queue
		 */
	public void checkIn(Passenger passenger, Seating seating) {
		passenger.setArrivalTime(LocalTime.now());
		passenger.setSeating(seating);
		line.add(passenger);
	}

	/**
	 * Board a passenger in the order of priority
	 *
	 */
	public Passenger board() {
		return line.remove();
	}
}
