package AirLine;

import java.util.concurrent.TimeUnit;

/**
 * This is a demo program to test the Airline boarding  implementation
 * 
 *
 *
 */
public class AirlineBoardingDemo {

	public static void main(String[] args) throws InterruptedException
	{
		AirlineBoarding bLine = new AirlineBoarding(new PassengerComparator());

		bLine.checkIn(new Passenger("Tara Silva"), Seating.FIRST);
		TimeUnit.MILLISECONDS.sleep(10);
		bLine.checkIn(new Passenger("Mirabella Jones"), Seating.ECON);
		TimeUnit.MILLISECONDS.sleep(10);
		bLine.checkIn(new Passenger("Ruth Mendez"), Seating.ECON);
		TimeUnit.MILLISECONDS.sleep(10);
		bLine.checkIn(new Passenger("Melvin Ingram"), Seating.BUSINESS);
		TimeUnit.MILLISECONDS.sleep(10);

		bLine.checkIn(new Passenger("Jeff Barnes"), Seating.FIRST);

		for (Passenger passenger = bLine.board(); passenger != null; passenger = bLine.board()) {
			System.out.println(passenger.toString() + " boarded\n");
		}
	}
}
