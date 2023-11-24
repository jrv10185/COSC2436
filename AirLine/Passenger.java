package AirLine;

import java.time.LocalTime;

/*
 * This class implements an airline passenger.
 *
 */
public class Passenger {
	private final String name;
	private Seating seating;
	private LocalTime arrivalTime;


	public Passenger(String name) {
		this.name = name;

	}

	/*
	 * Getter for the seating of the passenger
	 */
	public Seating getSeating() {
		return seating;
	}

	/*
	 * Setter for the seating of the passenger
	 */
	public void setSeating(Seating seating) {
		this.seating = seating;
	}

	/*
	 * Getter for the passenger's arrival time
	  */
	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	/*
	 * Setter for the passenger's arrival time
	 */
	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/*
	 *  * Getter for the passenger's name
	 */
	public String getName() {
		return name;
	}


	/*
	 * Returns the Passenger String representation
	 */
	@Override
	public String toString() {
		return name + "\n seating=" + seating + "\n arrivalTime=" + arrivalTime;
	}
}
