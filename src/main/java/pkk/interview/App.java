package pkk.interview;

import pkk.interview.flight.Flight;
import pkk.interview.flight.FlightSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        FlightSort flightSort = new FlightSort();
        List<Flight> flights = new ArrayList<>(Arrays.asList(new Flight[]{
                new Flight("A"),
                new Flight("B"),
                new Flight("C"),
        }));

        String rbds = "CBA";

        System.out.println("flights: " + flights);
        System.out.println("rbds: " + rbds);
        flightSort.flightSort(flights, "CBA");

        System.out.println("sorted: " + flights);
    }
}
